package praticas_aula_06;

public class AppEmpresa {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Ana", 7000);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Carlos", 7000);

        System.out.println("=== Funcionário CLT ===");
        funcionarioCLT.exibirDados();
        System.out.println("Salário Final: R$" + funcionarioCLT.calcularSalarioFinal());

        System.out.println("\n=== Funcionário PJ ===");
        funcionarioPJ.exibirDados();
        System.out.println("Salário Final: R$" + funcionarioPJ.calcularSalarioFinal());
    }
}
