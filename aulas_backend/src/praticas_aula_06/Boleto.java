package praticas_aula_06;

public class Boleto implements Pagamento{
    private String codigo;

    public Boleto(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado pelo boleto código " + codigo);
    }

    @Override
    public String getDescricao() {
        return "Boleto código " + codigo;
    }
}
