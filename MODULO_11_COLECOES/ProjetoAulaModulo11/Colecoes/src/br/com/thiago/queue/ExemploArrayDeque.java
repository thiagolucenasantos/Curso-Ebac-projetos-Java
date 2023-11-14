package br.com.thiago.queue;

import java.util.ArrayDeque;
import java.util.Deque;

//LISTA GERADA NA ORDEM DE ADIÇÃO
// PODEMOS TRABALHAR TANTO COM O ÚLTIMO ELEMENTO, TANTO COM O PRIMEIRO DA FILA
// INDEPENDENDE DA ORDEM QUE ENTROU OU SAIU
public class ExemploArrayDeque {
    public static void main(String[] args) {
        Deque<String> lista = new ArrayDeque<>();
        lista.add("Azul");
        lista.add("Amarelo");
        lista.add("Verde");

        System.out.println(lista);
        System.out.println(lista.contains("Azul"));
        System.out.println(lista.element()); //pegando primeiro elemento da fila
        System.out.println(lista.getFirst());// Pegando primeiro elemento da fila
        System.out.println(lista.getLast());//Pegando último elemento da fila

    }


}
