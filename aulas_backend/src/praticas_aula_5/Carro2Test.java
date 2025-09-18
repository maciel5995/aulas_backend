package praticas_aula_5;

public class Carro2Test {
    public static void main(String[] args) {
        Motor motor = new Motor(150, "Flex");
        Carro2 carro = new Carro2("Corolla", motor);

        carro.ligarCarro();
        carro.desligarCarro();
    }
}
