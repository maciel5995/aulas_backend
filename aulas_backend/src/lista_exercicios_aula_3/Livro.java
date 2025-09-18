package lista_exercicios_aula_3;

public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println(titulo + " - " + autor + " (" + ano + ")");
    }
}
