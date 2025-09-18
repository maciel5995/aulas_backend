package praticas_aula_06;

public class CartaoCredito implements Pagamento {
    private String titular;

    public CartaoCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no cartão de crédito de " + titular);
    }

    @Override
    public String getDescricao() {
        return "Cartão de Crédito de " + titular;
    }
}
