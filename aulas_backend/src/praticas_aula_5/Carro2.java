package praticas_aula_5;

public class Carro2 {
    private String modelo;
    private Motor motor; // Composição: Carro TEM um Motor

    public Carro2(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro " + modelo + "...");
        motor.ligar(); // delega a ação ao motor
    }

    public void desligarCarro() {
        System.out.println("Desligando o carro " + modelo + "...");
        motor.desligar();
    }
}
