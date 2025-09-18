package exemplos_aula_6;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");

        System.out.println("Lista de nomes: " + nomes);

        nomes.remove("Carlos");
        System.out.println("Após remover Carlos: " + nomes);

        if (nomes.contains("Maria")) {
            System.out.println("A lista contém Maria!");
        }
    }
}
