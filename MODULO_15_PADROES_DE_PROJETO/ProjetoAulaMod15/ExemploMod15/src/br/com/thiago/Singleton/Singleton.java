package br.com.thiago.Singleton;

public class Singleton {

    private static Singleton singleton;
    //ninguém consegue instanciar a classe por ser privada
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();// essa classe será instanciada somente uma vez
        }
        return singleton;
    }
}
