package br.com.thiago.IfElse;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade");

        int suaIdade = idade.nextInt()  ;

        if (suaIdade >= 50){
            System.out.println("Pode entrar!!");
        } else if (suaIdade >=30 && suaIdade <49) {
            System.out.println("Não pode entrar ainda, é só para coroas!!");
        } else {
            System.out.println("Não pode entrar ainda criança.");
        }
    }
}
