package br.com.thiago.Continue;

public class ExemploContinue {
    public static void main(String[] args) {
        for (int contador = 0; contador <=50; contador++){
            if (contador %5!=0){ //imprime números de 5 em 5
                continue;
            }
            System.out.println("Contador: " + contador);
        }
    }
}
