package exemplos_aula_3;

public class ContaCorrente {

    private String titular;
    // contrutor:
    public ContaCorrente(String titular){
        this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void mostrarInfo(){
        System.out.printf("Nome do titular: %s\n", getTitular());
    }
}

