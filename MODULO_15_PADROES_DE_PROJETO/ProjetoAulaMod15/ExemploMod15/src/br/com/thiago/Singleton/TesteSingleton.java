package br.com.thiago.Singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        //não instanciamos com new, chamamos o método getInstance(), para poder instanciar a classe
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
//no modo debug no primeiro singleton ele é verificado e é null, no segundo ele não
//é mais null e aloca a mesma referência do primeiro singleton no segundo.
