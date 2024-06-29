package JSM;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Controlador {

    public Estoque addProduto() {
        Scanner scn = new Scanner(System.in);
        Produto produto = new Produto();
        Estoque lista = new Estoque();
        
        String nome;
        String vencimentoS;
        int codigoProduto;
        double preco;
        int quantidade;

        System.out.println("Nome do produto: ");
        nome = scn.next();
        System.out.println("Data de vencimento: ");
        vencimentoS = scn.next();
        LocalDate vencimento = LocalDate.parse(vencimentoS, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Preço do produto: ");
        preco = scn.nextDouble();
        System.out.println("Codigo do produto: ");
        codigoProduto = scn.nextInt();
        System.out.println("Quantidade do produto: ");
        quantidade = scn.nextInt();

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setCodigoProduto(codigoProduto);
        produto.setQuantidade(quantidade);
        produto.setVencimento(vencimento);
        produto.setProximo(null);
        
        lista.add(produto);

        return lista;
    }
}
