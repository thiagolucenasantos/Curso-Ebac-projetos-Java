package br.com.thiago.interfaces.Canetas;

//Interface não podemos adicionar propriedades
public interface ICaneta { //o I no nome no inicio padrão para interface
    public void escrever(String texto);

   //  public String nome; -> não podemos implementar propriedades, não aceita

    public String getCor();

    //método default implementado somente na interface, sem necessidade de implementar nos métodos.
    default public void prodNovo(){
        System.out.println("Produto Novo");

    }
}
