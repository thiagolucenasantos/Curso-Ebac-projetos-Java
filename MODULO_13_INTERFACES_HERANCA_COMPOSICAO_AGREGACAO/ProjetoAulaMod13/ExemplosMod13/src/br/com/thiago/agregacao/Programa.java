package br.com.thiago.agregacao;

/**
 * Abstração é quando um objeto necessita de outros para existir.
 * Ex: a classe Venda precisa da classe Produto, Vendedor, Comprador para existir
 */
public class Programa {
    public static void main(String[] args) {

        Produto produtoTv= criarProduto(1l, "TV ", 39d);
        Produto celular = criarProduto(2l, "Celular ", 4000d);
        Vendedor vendedor = criarVendedor("Rodrigo", 10d);
        Comprador comprador = criarComprador("Thiago", 5000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor); // setando vendedor
        venda.setComprador(comprador);// setando comprador
        venda.add(produtoTv); // setando produto TV
        venda.add(celular);// setando produto Celular

        venda.concretizarVenda();
    }

    private static Produto criarProduto(Long codigo, String nome, double preco) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(preco);
        return produto;
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }
    private static Comprador criarComprador(String nome, double verba) {
        //exemplo de ligação com a classe criando o método com o this direto na classe Comprador, código mais
        // enxuto sem utilização de getter e setter, faz a mesma coisa que o de cima, mas criamos o método no Comprador
        return new Comprador(nome, verba);
    }

}
