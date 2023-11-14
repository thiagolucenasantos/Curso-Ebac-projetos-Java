package br.com.thiago.interfaces.Carro;

public interface ICarro {
    default boolean parar(){
        System.out.println("Veículo parando");
        return false;
    }
    default  public void andar(int velocidade){
        int vel = 50;
        if (velocidade <= vel){
            System.out.println("Dentro do limite de velocidade, pode continuar");
        } else {
            System.out.println(parar());
        }
    }
}
