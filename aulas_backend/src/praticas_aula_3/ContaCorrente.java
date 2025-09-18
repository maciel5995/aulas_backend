package praticas_aula_3;

public class ContaCorrente {
    private String titular;
    private long numeroConta;
    private float saldo;
    private float limite;

    // contrutor:
    public ContaCorrente(String titular, long numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.limite = 1000;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void emitirSaldo(){
        System.out.println("Saldo R$: " + getSaldo());
    }

    public void sacar(float valor){
        this.saldo -= valor;
        System.out.println("Saque efetuado com sucesso!");
    }

    public void depositar(float valor){
        this.saldo += valor;
        System.out.println("Depósito efetuado com sucesso!");
    }

    public void mostrarInfo(){
        System.out.printf("Nome do titular: %s\nConta Número: %d\nSaldo R$: %.2f\n", getTitular(), getNumeroConta(), getSaldo()+getLimite());
    }
}
