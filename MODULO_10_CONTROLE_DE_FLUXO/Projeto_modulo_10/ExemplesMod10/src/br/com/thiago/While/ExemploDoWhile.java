package br.com.thiago.While;

import java.util.Scanner;

//do while -> executa primeiro uma condição e depois pergunta se quer executar novamente

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta = "";
        do {
            System.out.println("Digite o número para gerar a tabuada: ");
            int num = entrada.nextInt();
            for (int i = 0; i<= 10; i++){
                System.out.println(num + " x " + i + " = " + num * i);
            }
            System.out.println("Deseja gerar novamente");
            resposta = entrada.next();
        }while (resposta.equals("Sim"));
        System.out.println("obrigado");
    }
}
