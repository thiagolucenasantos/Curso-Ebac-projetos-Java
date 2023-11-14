package generics;

import generics.WildcardExtendsDeOutraClasse.Banana;
import generics.WildcardExtendsDeOutraClasse.Fruta;
import generics.WildcardExtendsDeOutraClasse.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {
    public static void main(String[] args) {
        //Lista tipada do tipo String ou seja recebe somente String
        List<String> listaString = new ArrayList<>();
        listaString.add("Teste1");
        listaString.add("Teste2");
        imprimir(listaString);

        String primeiro = pegarPrimeiroLista(listaString);
        System.out.println(primeiro);

        System.out.println("Wildcard");
        imprimir2(listaString);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Banana());
        frutas.add(new Maca());
        imprimirFrutas(frutas);

    }

    //outro wildcard que recebe qualquer objeto e extende de outro como no exemplo como parâmetro a lista
    private static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Fruta fruta : lista){
            System.out.println(fruta);
        }
    }


    //Wildcard <?> vai aceitar também qualquer coisa
    //e ele é um método vazio não retorna nada
    public static void imprimir2(List<?> list){
        //toda classe herda Object por default, por isso utilizado como parâmetro no for
        for (Object st : list){
            System.out.println(st);
        }
    }

    //Lista genérica <T> recebe qualquer parâmetro que você passar e não retorna nada
    private static <T>void imprimir(List<T> lista) {
        for (T t : lista){
            System.out.println(t);
        }

    }
    //fazendo uma lista de generics onde o retorno também é, ele irá pegar o primeiro da lista
    private static <T> T pegarPrimeiroLista(List<T> lista){

        return lista.get(0);
    }
}
