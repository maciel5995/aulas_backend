package lista_exercicios_aula_3;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Maria", "Analista", 5000);

        f1.exibirInfo();
        f2.exibirInfo();

        f2.aumentarSalario(10); // 10% de aumento
        f2.aumentarSalario(500, true); // aumento fixo de R$500

        f2.exibirInfo();
    }
}
