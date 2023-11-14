package br.com.thiago;

public class CastingEmplicito {
    //Casting é quando mudamos um tipo de variável para outro tipo

    //CUIDADO AO UTILIZAR CASTING PRINCIPALMENTE SE FOR MUDAR PARA TIPOS QUE NÃO
    //SUPORTAM A QUANTIDADE DE VALORES ATRIBUIDOS

    public static void main(String[] args) {
        int numero = 10;
        short numero1 = (short) numero;// casting explícito

        //Exemplo de casting que dará problema no código por não comportar o tamanho
        long num = 11111111111111111l;
        System.out.println(num);
        int num1 = (int) num;
        System.out.println(num1);
    }
}
