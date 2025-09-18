package exemplos_aula_3;

public class ContaCorrenteTest {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("Rodrigo");

        contaCorrente.mostrarInfo();
        contaCorrente.setTitular("Maria");

        contaCorrente.mostrarInfo();
    }

}

