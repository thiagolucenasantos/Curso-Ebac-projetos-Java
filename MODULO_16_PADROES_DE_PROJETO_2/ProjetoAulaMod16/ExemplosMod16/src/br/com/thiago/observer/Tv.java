package br.com.thiago.observer;

public class Tv implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via TV " + subject.toString());
    }
}
