package exemplos_aula_6;

public class FormaTest {
    public static void main(String[] args) {
        Quadrado quadrado  = new Quadrado(3);
        Circulo circulo = new Circulo(2);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do cículo: " + circulo.calcularArea());

    }
}

