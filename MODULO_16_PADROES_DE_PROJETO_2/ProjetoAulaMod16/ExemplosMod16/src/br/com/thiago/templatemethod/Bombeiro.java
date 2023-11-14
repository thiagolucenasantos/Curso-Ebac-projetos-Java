package br.com.thiago.templatemethod;

public class Bombeiro extends Trabalhador{
//implementando o único método abstrato da classe Trabalhador em bombeiro
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro!!");
    }
}
