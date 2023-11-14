package br.com.thiago.SwitchCase;

import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    private static String getIdade(int idade) {
        String result;
        switch (idade){
            case 0: // nesse exemplo caso for 0 ou 5
            case 5:
            result = "Você é um bebe";
                break;
            case 6:
            case 10:
                result = "Você é um criança";
                break;
            case 11:
            case 18:
                result = "Você é um adolescente";
                break;
            default:
                result = "Você é adulto";
                break;
        }
        return result;
    }
}
