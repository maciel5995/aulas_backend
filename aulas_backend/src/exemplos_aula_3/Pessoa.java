package exemplos_aula_3;

public class Pessoa {
    String nome;
    int idade;

    // Construtor 1: sem parâmetros
    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    // Construtor 2: apenas nome
    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    // Construtor 3: nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

