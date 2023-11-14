package br.com.thiago.IfElse;

import java.util.Scanner;

public class ifElseExemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qual é o seu animal");
        String texto = entrada.nextLine();
        String animal = exemploAnimal(texto);
        System.out.println(animal);

    }

    private static String exemploAnimal(String animal) {
        String resultado;
        if (animal.equals("Cachorro") || animal.equals("Gato")){
            resultado = "Animal doméstico.";
        }else if (animal.equals("Leão")){
            resultado = "Animal selvagem";
        }else {
            resultado = "Animal Desconhecido";
        }
        return resultado;
    }
}
