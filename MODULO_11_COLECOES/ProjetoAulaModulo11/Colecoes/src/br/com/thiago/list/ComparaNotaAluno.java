package br.com.thiago.list;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno obj1, Aluno obj2) {
        return Double.compare(obj2.getNota(), obj1.getNota());
    }
}
