package br.com.thiago.templatemethod;

public class Demo {
    public static void main(String[] args) {
        Trabalhador trabalhador = new Bombeiro();
        trabalhador.executarRotina();//executando somente o método executar, os outros não estão visíveis porque são privados
        System.out.println("***Rotina Policial***");
        Trabalhador policial = new Policial();
        policial.executarRotina();
    }
}
