package br.com.thiago.list;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList2 {
    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {

        System.out.println("**** exemploListaSimplesOrdenadaClasseExterna ****");
        //Neste array List estamos passando a classe Aluno,não um tipo de variável
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Thiago", "Linux", 40);
        Aluno b = new Aluno("Joao", "Java", 20);
        Aluno c = new Aluno("Maria", "Php", 30);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação" + lista);
        Collections.sort(lista); // neste caso para que o collections funcione, precisamos implementar o método Comparable na classe Aluno
        System.out.println("Lista com ordenação" + lista);
        System.out.println("");

    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {

        System.out.println("**** exemploListaSimplesOrdenadaComparatorAlunoComparandoPelaNota ****");

        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Thiago", "Linux", 40);
        Aluno b = new Aluno("Joao", "Java", 20);
        Aluno c = new Aluno("Maria", "Php", 30);
        lista.add(a);
        lista.add(b);
        lista.add(c);

        // CRIANDO OUTRA CLASSE EXTERNA PARA FAZER COMPARAÇÃO PELAS NOTAS
        ComparaNotaAluno compararNota = new ComparaNotaAluno();
        Collections.sort(lista, compararNota);
        System.out.println("Lista ordenada por nota" + lista);
        System.out.println("");
    }
}
