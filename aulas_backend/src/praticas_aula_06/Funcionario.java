package praticas_aula_06;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$" + salarioBase);
    }

    // Método abstrato (cada subclasse deve implementar)
    public abstract double calcularSalarioFinal();
}
