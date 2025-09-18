package praticas_aula_5;

class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo " + modelo + " está ligado.");
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano); // chama o construtor da superclasse
        this.portas = portas;
    }

    public void abrirPortas() {
        System.out.println("Abrindo " + portas + " portas do carro " + modelo + ".");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    private boolean temBagageiro;

    public Moto(String modelo, int ano, boolean temBagageiro) {
        super(modelo, ano);
        this.temBagageiro = temBagageiro;
    }

    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }
}

