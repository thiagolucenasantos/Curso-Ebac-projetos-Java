package exceptionsEzemplo3Udemy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UTILIZANDO STACKTRACE
 * após um erro de excesão ele mostra o histórico passo a passo do erro
 * ajuda muito para verificar e tratar o erro
 */
public class UtilizandoStackTrace {
    public static void main(String[] args) {

        metodo1();
        System.out.println("Fim do Programa");
    }

    public static void metodo1() {
        System.out.println("Método1 Início");
        metodo2();
        System.out.println("Método1 Fim");
    }

    public static void metodo2() {
        System.out.println("Método2 Início");
        Scanner scanner = new Scanner(System.in);
        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
        } catch (InputMismatchException b) {
            System.out.println("Posição inválida");
        }
        scanner.close();
        System.out.println("Método2 Fim");
    }
}

