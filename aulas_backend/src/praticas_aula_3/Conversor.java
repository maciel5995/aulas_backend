package praticas_aula_3;

public class Conversor {
    // 1 - Celsius para Fahrenheit
    public double converter(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // 2 - Horas e minutos -> total em minutos
    public int converter(int horas, int minutos) {
        return (horas * 60) + minutos;
    }

}

