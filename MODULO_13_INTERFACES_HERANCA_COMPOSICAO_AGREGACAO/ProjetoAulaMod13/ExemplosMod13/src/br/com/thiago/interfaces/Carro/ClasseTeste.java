package br.com.thiago.interfaces.Carro;

public class ClasseTeste {
    public static void main(String[] args) {
        ICarro carro = new CarroPasseio();
        carro.andar(40);
       // System.out.println("Carro: " + carro);

        ICarro caminhao = new Caminhao();
        caminhao.andar(70);
       // System.out.println("Caminhão: " + caminhao);
    }
}
