package exemplos_aula_5;

class Gato extends Animal {
    public Gato(String nome) { // construtor da classe filha
        super(nome); // construtor da classe mãe
    }

    public void mostrarNome() {
        System.out.println("O nome do gato é " + nome);
    }
}
