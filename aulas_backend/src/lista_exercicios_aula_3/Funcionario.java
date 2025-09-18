package lista_exercicios_aula_3;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario() {
        this("Sem nome", "Sem cargo", 0.0);
    }

    public Funcionario(String nome, String cargo) {
        this(nome, cargo, 0.0);
    }

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Sobrecarga de métodos
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public void aumentarSalario(double valor, boolean fixo) {
        if (fixo) {
            this.salario += valor;
        }
    }

    public void exibirInfo() {
        System.out.println(nome + " | " + cargo + " | Salário: R$" + salario);
    }
}
