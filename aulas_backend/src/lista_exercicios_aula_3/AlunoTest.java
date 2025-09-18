package lista_exercicios_aula_3;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.idade = 20;

        Aluno a2 = new Aluno();
        a2.nome = "Carlos";
        a2.idade = 22;

        a1.exibirDados();
        a2.exibirDados();
    }
}
