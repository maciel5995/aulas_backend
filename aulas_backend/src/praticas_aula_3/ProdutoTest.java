package praticas_aula_3;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto("Caderno", 12.50);
        Produto p3 = new Produto("Caneta", 2.50, 100);

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}
