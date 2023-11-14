package br.com.thiago.interfaces.Canetas;

public class ClasseTeste {

    public static void main(String[] args) {
        //Instanciando na interface ICaneta a classe CanetaEsferográfica
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Caneta");
        caneta.prodNovo(); // método default implementado somente na interface ICaneta
        System.out.println(caneta.getCor()+"\n");

        ICaneta giz = new Giz();
        caneta.escrever("Olá Giz");
        caneta.prodNovo(); // método default implementado somente na interface ICaneta
        System.out.println( giz.getCor() + "\n" );

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Lápis");
        System.out.println(lapis.getCor());
    }
}
