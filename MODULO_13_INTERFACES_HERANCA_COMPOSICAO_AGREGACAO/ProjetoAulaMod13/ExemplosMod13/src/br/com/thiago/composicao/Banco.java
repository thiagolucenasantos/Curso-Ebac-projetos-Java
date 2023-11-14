package br.com.thiago.composicao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Composição é quando um objeto depende de outro, quando o objeto principal é excluído
 * ele também exclui todos os seus relacionamentos com os dependentes.
 */

//CLASSE PRINCIPAL
public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupanca> contasPoupancas;

    public Banco(){
        this.contasCorrentes = new HashSet<>();
        this.contasPoupancas = new HashSet<>();
    }
    public void add(ContaCorrente cc){
        this.contasCorrentes.add(cc);
    }
    public void add(ContaPoupanca cp){
        this.contasPoupancas.add(cp);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
