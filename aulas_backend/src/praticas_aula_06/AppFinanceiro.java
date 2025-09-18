package praticas_aula_06;

public class AppFinanceiro {
    public static void main(String[] args) {
        Pagamento pagto1 = new CartaoCredito("Rodrigo Maciel");
        Pagamento pagto2 = new Boleto("12345-6789");
        Pagamento pagto3 = new Pix("rodrigo.maciel@satc.edu.br");

        System.out.println(pagto1.getDescricao());
        System.out.println(pagto2.getDescricao());
        System.out.println(pagto3.getDescricao());

        pagto1.pagar(150);
        pagto2.pagar(200);
        pagto3.pagar(300);

    }
}
