package JSM;

public class Estoque {

    private Produto inicio;
    private Produto fim;
    int numElementos = 0;
    private Estoque proximo;

    public void add(Produto e) {
        if (numElementos == 0) {
            this.inicio = e;
            this.fim = this.inicio;
            numElementos++;
        } else {
            Produto nova = new Produto(e);
            this.fim.setProximo(nova);
            fim = nova;
            numElementos++;
        }
    }

    private boolean posicaoOcupada(int index) {
        return index >= 0 && index < numElementos;
    }

    private Produto pegaNo(int index) {
        if (!posicaoOcupada(index)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        Produto atual = inicio;
        for (int i = 0; i < index; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void removeFirst() {
        if (!posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        inicio = inicio.getProximo();
        numElementos--;
        fim = pegaNo(numElementos - 1);
        if (numElementos == 0) {
            fim = null;
        }

    }

    public void remove(int index) {
        if (!posicaoOcupada(index)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (index == 0) {
            removeFirst();
        } else if (index == numElementos - 1) {
            removeLast();
        } else {
            Produto anterior = pegaNo(index - 1);
            Produto atual = anterior.getProximo();
            anterior.setProximo(atual.getProximo());
            atual = null;
            numElementos--;
        }

    }

    public void removeLast() {
        if (!posicaoOcupada(numElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (numElementos == 1) {
            removeFirst();
        } else {
            Produto penultima = pegaNo(numElementos - 2);
            penultima.setProximo(null);

            numElementos--;
            fim = pegaNo(numElementos - 1);
        }
    }

    public int tamanho() {

        return numElementos;
    }

    public Object pega(int posicao) {
        return pegaNo(posicao).getNome();
    }

    public boolean conteins(Object e) {
        Produto atual = inicio;
        while (atual != null) {
            if (atual.getNome().equals(e)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public String toString() {
        if (numElementos == 0) {
            return "Lista está Vazia";
        }
        String str = "";
        Produto p = inicio;
        while (p != null) {
            str = str + p.getNome();
            str += "\n";
            p = p.getProximo();
        }
        return str;
    }

}
