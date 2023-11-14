package br.com.thiago.For;

import java.util.Scanner;

public class ExempleFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Quantidade é: " + i);

            //SEGUNDO EXEMPLO FOR
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o número para gerar a tabuada");
            int num = entrada.nextInt();
            for (int j = 0; j <=10; j++){
                System.out.println(num + "x" + j + " = " + num*j);
            }
        }
    }
}
