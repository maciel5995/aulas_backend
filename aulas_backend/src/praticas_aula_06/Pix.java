package praticas_aula_06;

public class Pix implements Pagamento{
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Pix para chave " + chavePix);
    }

    @Override
    public String getDescricao() {
        return "Pix para chave " + chavePix;
    }
}
