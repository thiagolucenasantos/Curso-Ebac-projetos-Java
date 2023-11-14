package br.com.thiago.Hamburgueria;

public class OperacaoHamburgueria {

    public static void main(String[] args) {
       // Gerente gerente = new Gerente(new CheeseBurgerConstrucao());
        Gerente gerente = new Gerente();
        gerente.setConstrucao(new CheeseBurgerConstrucao());
        Hamburguer hamburguer = gerente.construirHamburguer();
        hamburguer.print();

        gerente.setConstrucao(new HamburguerVegano());
        Hamburguer hamburguer1 = gerente.construirHamburguer();
        hamburguer1.print();
    }
}
