package br.com.thiago.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumero();

    }

    private static void exemploNumero() {
        List<Number> numeros = new ArrayList<>();
        numeros.add(20);
        numeros.add(6);
        System.out.println(numeros);
    }

    //É COMO UM ARRAY CUJO TAMANHO PODE CRESCER
    // A BUSCA DE UM ELEMENTO É RÁPIDA, MAS INSERÇÕES E EXCLUSÕES NÃO SÃO.
    private static void exemploListaSimples() {
        System.out.println("**** Exemplo de Lista Simples ****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lucia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** Exemplo de Lista Simples Ordem Ascendente ****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lucia Ferreira");
        lista.add("Bruno Santos");
        Collections.sort(lista); //Método que organiza a lista por ordem alfabética
        System.out.println(lista);
        System.out.println("");
    }
    }



