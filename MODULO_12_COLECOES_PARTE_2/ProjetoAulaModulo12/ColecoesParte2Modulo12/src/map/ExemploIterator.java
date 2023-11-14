package map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Thiago");
        lista.add("Santos");
        lista.add("Mauricio");
        lista.add("Pedro");

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) { //enquanto for verdadeira
            System.out.println(it.next());//interajá com o próximo elemento até acabar
        }
    }
}
