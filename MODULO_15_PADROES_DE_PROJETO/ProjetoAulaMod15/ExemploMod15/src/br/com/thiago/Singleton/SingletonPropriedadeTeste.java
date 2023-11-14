package br.com.thiago.Singleton;

public class SingletonPropriedadeTeste {

    //No exemplo a baixo ele sempre irá imprimir o valor da variaável singleton, que ter o seu valor Teste
    //após receber o primeiro valor ela não recebe mais um novo valor
    public static void main(String[] args) {
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste 1");
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
