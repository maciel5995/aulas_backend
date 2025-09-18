package exemplos_aula_4;

public class InstrucoesControle {

    public static void main(String[] args) {
//        float media = 6;
//        int numeroFaltas = 20;
//
//        if(media >= 6) {
//            System.out.println("Aprovado!");
//        }
//
//        if(media >= 6 && numeroFaltas <= 20) {
//            System.out.println("Aprovado!");
//        }
//
//        if(media >= 6 && numeroFaltas <= 20) {
//            System.out.println("Aprovado!");
//        } else {
//            System.out.println("Reprovado");
//        }
//
//        if(media < 6 || numeroFaltas > 20) {
//            System.out.println("Reprovado!");
//        }
//
//        if(media < 6 || numeroFaltas > 20) {
//            System.out.println("Reprovado!");
//        } else {
//            System.out.println("Aprovado!");
//        }
//
//        float num1 = 2, num2 = 3;
//        byte opcao = 1;
//        switch (opcao) {
//            case 1:
//                System.out.println("Resultado da adição: " + (num1 + num2));
//                break;
//            case 2:
//                System.out.println("Resultado da subtração: " + (num1 - num2));
//                break;
//            case 3:
//                System.out.println("Resultado da multiplicação: " + (num1 * num2));
//                break;
//            case 4:
//                if (num2 != 0) {
//                    System.out.println("Resultado da divisão: " + (num1 / num2));
//                } else {
//                    System.out.println("Erro: divisão por zero não é permitida!");
//                }
//                break;
//            default:
//                System.out.println("Opção inválida!");
//        }
//
//        int numero = 7;
//
//        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
//
//        System.out.println("O número " + numero + " é " + resultado);
//
//        int a = 10, b = 20;
//
//        int maior = (a > b) ? a : b;
//
//        System.out.println("Maior número: " + maior);
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Índice: " + i);
//        }
//
//        int i = 0;
//        while(i < 5){
//            System.out.println("Índice: " + i);
//            i++;
//        }

//        int j = 0;
//        while(j < 5){ // loop infinito
//            System.out.println("Índice: " + i);
//        }
//
//        int j = 0;
//        do {
//            System.out.println("Índice: " + j);
//            j++;
//        } while (j < 5);
//
//         do {
//            System.out.println("Índice: " + j);
//        } while (j < 5); // loop infinito

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Percorrendo com for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

        System.out.println("\nPercorrendo com while:");
        int j = 0;
        while (j < numeros.length) {
            System.out.println("Elemento na posição " + j + ": " + numeros[j]);
            j++;
        }

        System.out.println("\nPercorrendo com do-while:");
        int k = 0;
        do {
            System.out.println("Elemento na posição " + k + ": " + numeros[k]);
            k++;
        } while (k < numeros.length);


    }
}

