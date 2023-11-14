package br.com.thiago.While;

import java.util.Scanner;

public class ExemploWhile2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Diseja executar alguma tabuada?");
        String resposta = entrada.next();

        while (resposta.equalsIgnoreCase("Sim")){ //aceita o sim tanto maiusculo quanto minusculos
            System.out.println("Digite um número para gerar a tabuada");
            int num = entrada.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.println(num + " x " + i + " == " + num*i);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum número");
            resposta = entrada.next();
        }
        System.out.println("Obrigado");
    }
}
