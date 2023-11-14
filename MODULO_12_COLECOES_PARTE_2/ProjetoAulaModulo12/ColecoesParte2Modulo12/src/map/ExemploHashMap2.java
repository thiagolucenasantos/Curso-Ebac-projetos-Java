package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Permite chaves e valores null. Não existe garantia que os dados ficarão ordenados.
 * <p>
 * Para usar uma classe que implementa Map, quaisquer classes que forem utilizadas como chave devem sobrescrever
 * os métodos hashCode() e equals() ou seja é obrigatório esses métodos.
 */

public class ExemploHashMap2 {
    public static void main(String[] args) {
        exemploListaSimplesInterandoChaveEValor();

    }

    //utilizando entrySet método que obtem os dados tanto da chave quanto do valor
    private static void exemploListaSimplesInterandoChaveEValor() {
        System.out.println("*** exemploListaSimplesInterandoChaveEValor ***");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Thiago");
        lista.put(1, "Thiago"); // Chave não se repete, como no exemplo o Thiago não é impresso duas vezes, somente uma.
        lista.put(2, "Antonio");
        lista.put(3, "Carlos");
        lista.put(4, "Francisca");

        System.out.println("*** for simples ***");
        Set<Map.Entry<Integer, String>> chaveValor = lista.entrySet();
        for (Map.Entry<Integer, String> e : chaveValor) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("*** forEach simples ***");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("*** utilizando stream ***");
        lista.keySet().stream().forEach(System.out::println);//Imprimindo as chaves
        lista.values().stream().forEach(System.out::println);// Imprimindo os valores

        System.out.println("*** utilizando stream, imprimindo chave e valor juntos ***");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("*** iterator ***");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while (it.hasNext()){ // enquanto for verdade ele irá executar o que está dentro do while
            Map.Entry<Integer, String> dados = it.next();
            System.out.println("Chave: " + dados.getKey());
            System.out.println("Chave: " + dados.getValue());
        }
    }
}
