package array;

import java.util.Scanner;

public class ExemploArraySortDinamico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números desejados: ");

        String resposta = scanner.next();
        String[] vetorStr = resposta.split(",");
        int[] vet = convert(vetorStr);
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for (i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
        System.out.println(" ");

        for (i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;

                }
            }
        }
        System.out.println("Vetor organizado");
        for (i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
    }

    public static int[] convert(String[] vetorStr) {
        int[] numbers = new int[vetorStr.length];
        for (int i = 0; i < vetorStr.length; i++) {
            numbers[i] = Integer.parseInt(vetorStr[i]);
        }
        return numbers;
    }
}
