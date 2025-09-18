package praticas_aula_4;

public class No {
    private char valor;
    private No proximo;

    public No(char valor){
        this.valor = valor;
        this.proximo = null;
    }

    public void mostraNo(){
        System.out.println(this.valor);
    }
}
