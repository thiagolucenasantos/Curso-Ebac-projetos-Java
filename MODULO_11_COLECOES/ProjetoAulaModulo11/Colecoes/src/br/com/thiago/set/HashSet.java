package br.com.thiago.set;

import java.util.Set;

/**
 * Hashset não tem ordem.
 * O acesso aos dados é mais rápido que um TreeSet, mas os dados não são ordenados.
 * Não repete valores na lista.
 * Caso o parâmetro do Set seja uma classe você deverá gerar os métodos equals e hashCode
 * para que faça a comparaçção e respeite a não duplicação de dados inseridos na lista.
 */

public class HashSet {
    public static void main(String[] args) {
        exemploListaSimples();
    }

        private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new java.util.HashSet<>();
        lista.add("Thiago");
        lista.add("Joao"); // Não repete valores na lista como neste exemplo do João.
        lista.add("Maria");
        lista.add("Marcos");
        lista.add("Joao");
        lista.add("Pedro");

        System.out.println(lista);

    }
}
