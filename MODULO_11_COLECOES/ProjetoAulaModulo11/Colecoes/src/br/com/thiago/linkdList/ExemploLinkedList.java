package br.com.thiago.linkdList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//AO CONTRÁRIO DO ARRAYLIST, AS BUSCAS SÃO LENTAS E INSERÇÕES E EXCLUSÕES SÃO RÁPIDAS.

public class ExemploLinkedList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdesAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("****exemploListaSimples****");
        List<String> lista = new LinkedList<>();
        lista.add("João");
        lista.add("Rogério");
        lista.add("Pedro");
        System.out.println(lista);

        //Removendo uma posição
        lista.remove(0);
        System.out.println("Removendo posição 0 da lista de nomes: " + lista);

        //Consultando se tem o nome na lista

        boolean consulta = lista.contains("Rogério");
        System.out.println("Tem o nome consultado: " + consulta);

        System.out.println("");
    }

    private static void exemploListaSimplesOrdesAscendente() {
        System.out.println("****exemploListaSimplesOrdesAscendente****");
        List<String> lista = new LinkedList<>();
        lista.add("João");
        lista.add("Rogério");
        lista.add("Pedro");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
