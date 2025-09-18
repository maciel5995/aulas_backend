package praticas_aula_06;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 0.9; // desconto de 10%
    }
}
