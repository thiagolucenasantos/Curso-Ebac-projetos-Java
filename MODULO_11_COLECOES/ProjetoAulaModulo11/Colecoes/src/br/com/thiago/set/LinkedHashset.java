package br.com.thiago.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Os elementos são impressos na ordem que foram inseridos
 * Não repete valores da lista.
 * Caso o parâmetro do Set seja uma classe você deverá gerar os métodos equals e hashCode
 * para que faça a comparaçção e respeite a não duplicação de dados inseridos na lista.
 */

public class LinkedHashset {
    public static void main(String[] args) {
        exemploListaSimples();
    }
    public static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new LinkedHashSet<>();
        lista.add("Carlos");
        lista.add("Nascimento");
        lista.add("Jéssica");
        lista.add("Nascimento");
        lista.add("Carlos");
        lista.add("Marcos");
        System.out.println(lista);
    }
}
