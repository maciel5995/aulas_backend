package exemplos_aula_6;

public class Quadrado extends Forma{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
}

