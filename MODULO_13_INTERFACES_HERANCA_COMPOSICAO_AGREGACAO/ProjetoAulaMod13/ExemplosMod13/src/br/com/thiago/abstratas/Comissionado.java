package br.com.thiago.abstratas;

public class Comissionado extends Empregado { // extends, significa que herda todos os atributos de empregado
    private Double totalVenda;
    private Double totalComissao;

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }

    @Override
    public Double vencimento() {
        return totalVenda * totalComissao;


    }
}
