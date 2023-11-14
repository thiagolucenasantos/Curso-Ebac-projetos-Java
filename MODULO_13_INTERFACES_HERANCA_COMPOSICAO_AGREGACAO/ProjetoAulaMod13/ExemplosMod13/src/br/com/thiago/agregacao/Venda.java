package br.com.thiago.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Vendedor vendedor;
    private Comprador comprador;
    private List<Produto> produtos;
    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // fazendo o método set de Produto para adicionar dentro da lista Produto
    //utilizamos o add para adiciona dentro da lista
    public void add(Produto produto){
        this.produtos.add(produto);
    }
    public void concretizarVenda(){
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("Comprou os itens: ");
        for (Produto prod : produtos){
            System.out.println("Nome produto: " + prod.getNome() + "- Valor do produto: " + prod.getPreco());
        }
        System.out.println("Vendedor: " + this.vendedor.getNome());

    }
    public void cancelarVenda(){
        System.out.println("Venda Cancelada");
    }
}
