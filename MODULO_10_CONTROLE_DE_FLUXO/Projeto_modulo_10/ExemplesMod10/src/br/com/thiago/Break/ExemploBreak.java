package br.com.thiago.Break;

import java.util.Scanner;

public class ExemploBreak {
    public static void main(String[] args) {

        for (int j = 0; j <=500; j++){
            System.out.println(j);
            if (j == 10){
                break; //break utilizado para parar o loop, nesse caso irá parar no 10
            }
        }
    }
}
