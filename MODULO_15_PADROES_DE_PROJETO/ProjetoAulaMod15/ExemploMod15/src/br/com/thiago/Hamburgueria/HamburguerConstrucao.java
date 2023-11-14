package br.com.thiago.Hamburgueria;

public abstract class HamburguerConstrucao {

    Hamburguer hamburguer = new Hamburguer();

    abstract void contruirBun();
    abstract void construirCarne();
    abstract void construirSalada();
    abstract void construirQueijo();
    abstract void construirSauca();

    Hamburguer construir(){
        return hamburguer;
    }

}
