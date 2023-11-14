package br.com.thiago.interfaces.Carro;

public class Caminhao implements ICarro{

    //SUBSTITUINDO MENSAGEM DO DEFAULT DO MÉTODO parar()
    @Override
    public boolean parar() {
        System.out.println("Atenção veículo em alta velocidade");
        return false;
    }
}
