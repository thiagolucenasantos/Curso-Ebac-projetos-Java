package br.com.thiago.Hamburgueria;

public class HamburguerVegano extends HamburguerConstrucao{

    @Override
    void contruirBun() {
        hamburguer.setBun("Vegano Bun");
    }

    @Override
    void construirCarne() {
        hamburguer.setCarne("Vegano Carne");

    }

    @Override
    void construirSalada() {
    hamburguer.setSalada("Vegano Salada");
    }

    @Override
    void construirQueijo() {
        hamburguer.setQueijo("Vegano Queijo");
    }

    @Override
    void construirSauca() {
        hamburguer.setSauca("Vegano Sauça");
    }
}
