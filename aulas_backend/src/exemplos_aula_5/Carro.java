package exemplos_aula_5;

class Carro {
    protected Motor motor;

    public Carro(){
        this.motor = new Motor();
    }

    public void dirigir(){
        this.motor.ligar();
        System.out.println("Carro em movimento...");
    }
}

