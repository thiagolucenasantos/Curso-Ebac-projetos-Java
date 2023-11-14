package br.com.thiago;

public class Operadores {

    public static void main(String[] args) {
        operacoesAtribuicoes();//um método estático só pode ser chamado dentro de outro método estático
        operacoesAritmeticas(); //um método estático só pode ser chamado dentro de outro método estático
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoesLogicas();
    }
    private static void operacoesAtribuicoes() {
        System.out.println("**** operacoesAtribuicoes ****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
    }

    public static void operacoesAritmeticas() {
        System.out.println("**** operacoesAritmeticas ****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 +10)/2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
    private static void operacoesIncrementoDecremento() {
        System.out.println("**** operacoesIncrementoDecremento ****");
        int num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
        System.out.println("executa antes de qualquer ação, pouco utilizado");
        ++num1;
        System.out.println(num1);
        --num1;
        System.out.println(num1);
    }
    public static void operacoesRelacionais() {
        System.out.println("**** operacoesRelacionais ****");
        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2; // toda variável booleana inicia com is
        boolean isMaiorIgual = num1 >= num2;
        boolean isMenor = num1 < num2;
        boolean isMenorIgual = num1 <= num2;
        boolean isigual = num1 == num2;
        boolean isDiferente = num1 != num2;

        System.out.println("É maior: " + isMaior);
        System.out.println("É maior ou igual: " +isMaiorIgual);
        System.out.println("É menor: " +isMenor);
        System.out.println("É menor ou igual: " +isMenorIgual);
        System.out.println("É igual: " +isigual);
        System.out.println("É diferente: " +isDiferente);

    }

        public static void operacoesLogicas(){
            System.out.println("**** operacoesLogicas ****");
            int num1 = 10;
            boolean isDentro10 = num1 >= 10 && num1 <= 10;
            boolean isDentroOu10 = num1 >= 10 || num1 <= 4;
            boolean isDentroNot10 = num1 >= 10 != num1 <= 10;

            System.out.println("É maior ou igual a 1 e menor ou igual a 10 : " + isDentro10);
            System.out.println("É maior ou igual a 1 ou menor ou igual a 10 : " + isDentroOu10);
            System.out.println("Negação se for verdadeiro ele retorna falso : " + isDentroNot10);

        }
   }
