package exemplos_aula_6;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Criando um HashMap onde a chave é String e o valor é Integer
        HashMap<String, Integer> estoque = new HashMap<>();

        // Adicionando elementos (chave -> valor)
        estoque.put("Maçã", 50);
        estoque.put("Banana", 30);
        estoque.put("Laranja", 20);

        // Exibindo o estoque completo
        System.out.println("Estoque inicial: " + estoque);

        // Acessando o valor pela chave
        System.out.println("Quantidade de Maçãs: " + estoque.get("Maçã"));

        // Atualizando o valor de uma chave existente
        estoque.put("Banana", 45);
        System.out.println("Após atualizar bananas: " + estoque);

        // Removendo um item pela chave
        estoque.remove("Laranja");
        System.out.println("Após remover laranjas: " + estoque);

        // Verificando se uma chave existe
        if (estoque.containsKey("Maçã")) {
            System.out.println("Temos maçãs no estoque!");
        }

        // Percorrendo todas as chaves e valores
        System.out.println("\n=== Estoque Final ===");
        for (String fruta : estoque.keySet()) {
            System.out.println(fruta + " -> " + estoque.get(fruta) + " unidades");
        }
    }
}
