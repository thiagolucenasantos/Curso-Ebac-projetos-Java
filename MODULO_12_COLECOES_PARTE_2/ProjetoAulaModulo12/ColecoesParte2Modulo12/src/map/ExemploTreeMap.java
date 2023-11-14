package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Permite chaves e valores null.
 *
 * Garantia que os dados ficarão por ordem ascendente se baseando na key. *
 *
 * Para usar uma classe que implementa Map, quaisquer classes que forem utilizadas como chave devem sobrescrever
 * os métodos hashCode() e equals() ou seja é obrigatório esses métodos.
 */

public class ExemploTreeMap {
    public static void main(String[] args) {
        exemploListaSimples();

    }

    //TreeMap mantem a ordem de se baseando na key do Map
    private static void exemploListaSimples() {
        System.out.println("*** exemploListaSimples ***");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Thiago");
        lista.put(1, "Thiago"); // Chave não se repete, como no exemplo o Thiago não é impresso duas vezes, somente uma.
        lista.put(4, "Francisca");
        lista.put(3, "Carlos");
        lista.put(2, "Antonio");

        System.out.println("Chaves e valores: " + lista);
        System.out.println("Somente os valores: " + lista.values()); //imprimimdo somente os valores das chaves, somente os nomes.
        System.out.println("Somente as chaves: " + lista.keySet());
    }
}
