package br.com.thiago;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeEmpresa;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void relatorioJuridica(){
        System.out.println("Nome: " + this.getNomeEmpresa());
        System.out.println("Cnpj: " + this.getCnpj());
        System.out.println("Endereço: " + this.getEndereco());
    }
}
