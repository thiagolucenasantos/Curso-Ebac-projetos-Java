package br.com.thiago.Hamburgueria;

public class Gerente {
    HamburguerConstrucao construcao;

//    public Gerente(HamburguerConstrucao construcao){
//        this.construcao = construcao;
//    }

    public HamburguerConstrucao getConstrucao(){
        return construcao;
    }

    public void setConstrucao(HamburguerConstrucao construcao) {
        this.construcao = construcao;
    }

    public Hamburguer construirHamburguer(){
        construcao.contruirBun();
        construcao.construirCarne();
        construcao.construirSalada();
        construcao.construirQueijo();
        construcao.construirSauca();
        return construcao.construir();
    }
}
