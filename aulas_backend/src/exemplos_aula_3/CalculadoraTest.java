package exemplos_aula_3;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));        // chama int,int
        System.out.println(calc.somar(2, 3, 4));  // chama int,int,int
        System.out.println(calc.somar(2.5, 3.7));    // chama double,double
    }
}
