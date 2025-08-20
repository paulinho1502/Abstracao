package exercicio01;

public class Produto implements Exibivel {
    String nome;
    Double preco;
    String categoria;

    public Produto(String nome, Double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("categoria: " + categoria);

    }
}
