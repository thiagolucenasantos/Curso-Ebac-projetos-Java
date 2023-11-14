public class PrimeiraClasse {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(); // Precisamos instanciar a clsse Cliente, para ter disponíveis os atributos na memória.
        cliente.cadastrarEndereco("Rua Teste");
        cliente.setCodigo(2); //adicionando o valor 2 ao set cliente
        System.out.println(cliente.getCodigo());// utilizando o get para pegar o valor de set no método cliente da classe Cliente
      //  System.out.println(cliente.getEndereco());
        cliente.imprimirEndereco();
        String end = cliente.enderecoDoThiago(); //colocando o método dentro de uma variável para ser utilizada
        System.out.println(end);
        //ou jogar o método direto no print
        System.out.println(cliente.enderecoDoThiago());

        int valorTotal = cliente.getValorTotal();
        System.out.println(valorTotal);
        //ou jogar o método direto no print
        System.out.println(cliente.getValorTotal());


    }
}
