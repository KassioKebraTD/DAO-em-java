package JSM;

import java.time.LocalDate;
import java.util.Date;

public class Produto {

    private String nome;
    private LocalDate vencimento;
    private Produto proximo;
    private int codigoProduto;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(Produto e) {
        this.preco = e.getPreco();
        this.nome = e.getNome();
        this.vencimento = e.getVencimento();
        this.proximo = null;
    }

    public Produto(double preco, String nome, LocalDate vencimento, Produto proximo) {
        this.preco = preco;
        this.nome = nome;
        this.vencimento = vencimento;
        this.proximo = proximo;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public Produto getProximo() {
        return proximo;
    }

    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }

}
