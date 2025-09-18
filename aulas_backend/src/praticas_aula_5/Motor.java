package praticas_aula_5;

class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void ligar() {
        System.out.println("Motor " + tipo + " de " + potencia + " cavalos está ligado.");
    }

    public void desligar() {
        System.out.println("Motor desligado.");
    }
}
