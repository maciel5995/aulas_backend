package praticas_aula_3;

public class ContaCorrenteTest {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Rodrigo", 12345);

        contaCorrente.mostrarInfo();
        contaCorrente.depositar(200);
        contaCorrente.mostrarInfo();
        contaCorrente.sacar(100);
        contaCorrente.mostrarInfo();
    }
}
