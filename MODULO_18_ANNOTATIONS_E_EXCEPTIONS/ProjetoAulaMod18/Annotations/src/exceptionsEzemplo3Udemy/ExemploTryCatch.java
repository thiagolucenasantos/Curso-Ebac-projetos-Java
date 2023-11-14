package exceptionsEzemplo3Udemy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
        }catch (InputMismatchException b){
            System.out.println("Posição inválida");
        }


        scanner.close();
    }

}
