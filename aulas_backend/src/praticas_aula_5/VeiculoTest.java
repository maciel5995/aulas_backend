package praticas_aula_5;

public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", 2023, 4);
        carro.ligar();
        carro.abrirPortas();

        Moto moto = new Moto("Ninja", 2022, true);
        moto.ligar();
        moto.empinar();
    }
}
