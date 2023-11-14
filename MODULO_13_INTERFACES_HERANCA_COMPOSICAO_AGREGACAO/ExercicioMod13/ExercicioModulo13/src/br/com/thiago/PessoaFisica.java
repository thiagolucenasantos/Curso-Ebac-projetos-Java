package br.com.thiago;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void relatorioFisica(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobre nome: " + this.getSobreNome());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Ocupação: " + this.getOcupacao());
    }
}
