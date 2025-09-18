package praticas_aula_3;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void exibirInfo() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Quantidade: " + quantidade);
    }

}
