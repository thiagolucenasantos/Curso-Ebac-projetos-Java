package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Permite chaves e valores null.
 *
 * A ordem é exatamente a que você coloca no Map.
 *
 * Para usar uma classe que implementa Map, quaisquer classes que forem utilizadas como chave devem sobrescrever
 * os métodos hashCode() e equals() ou seja é obrigatório esses métodos.
 */

public class ExemploLinkedHashMap {
    public static void main(String[] args) {
        exemploListaSimples();

    }

    //LinkedHashMap mantém a ordenação de acordo com o que foi incluso no Map
    private static void exemploListaSimples() {
        System.out.println("*** exemploListaSimples ***");
        Map<Integer, String> lista = new LinkedHashMap<>();
        lista.put(1, "Thiago");
        lista.put(1, "Thiago"); // Chave não se repete, como no exemplo o Thiago não é impresso duas vezes, somente uma.
        lista.put(3, "Carlos");
        lista.put(2, "Antonio");
        lista.put(4, "Francisca");

        System.out.println("Chaves e valores: " + lista);
        System.out.println("Somente os valores: " + lista.values()); //imprimimdo somente os valores das chaves, somente os nomes.
        System.out.println("Somente as chaves: " + lista.keySet());
    }
}
