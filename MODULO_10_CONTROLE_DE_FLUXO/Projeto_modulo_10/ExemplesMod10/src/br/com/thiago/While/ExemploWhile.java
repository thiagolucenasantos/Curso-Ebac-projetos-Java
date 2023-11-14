package br.com.thiago.While;

//PRIMEIRO VERIFICA SE A CONDIÇÃO É VERDADEIRA PARA SER EXECUTADA

public class ExemploWhile {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 5){
            System.out.println("Repetir: " + num);
            num++; //se não for esse contador o while roda infinitamente
            }
        }
    }

