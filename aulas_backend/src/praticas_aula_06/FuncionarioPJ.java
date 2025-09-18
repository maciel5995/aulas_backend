package praticas_aula_06;

public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.2; // bônus de 20%
    }
}
