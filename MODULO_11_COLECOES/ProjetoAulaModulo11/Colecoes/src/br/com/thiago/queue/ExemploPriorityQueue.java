package br.com.thiago.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        //Ordenação Natural
        Queue<String> lista = new PriorityQueue<>();
        lista.add("Pequeno");
        lista.add("Médio");
        lista.add("Grande");
        while (lista.size() != 0){
            System.out.println(lista.remove());
        }

    }
}
