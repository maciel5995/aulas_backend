package exemplos_aula_3;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();                            // Usa construtor 1
        Pessoa pessoa2 = new Pessoa("Ana");                 // Usa construtor 2
        Pessoa pessoa3 = new Pessoa("Carlos", 25);    // Usa construtor 3

        pessoa1.exibir();
        pessoa2.exibir();
        pessoa3.exibir();
    }
}
