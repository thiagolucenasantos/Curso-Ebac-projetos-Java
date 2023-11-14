package br.com.thiago;

public class RelatorioPessoas {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Thiago");
        pessoaFisica.setSobreNome("José");
        pessoaFisica.setIdade(37);
        pessoaFisica.setCpf("234.456.454-74");
        pessoaFisica.setEndereco("Rua Cascais n° 2");
        pessoaFisica.setOcupacao("Gerente de Negócios");

        System.out.println("Relatório Pessoa Física");
        pessoaFisica.relatorioFisica();

        System.out.println("\nRelatório Pessoa Jurídica");
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNomeEmpresa("Tecno Mundo");
        pessoaJuridica.setCnpj("05.389.490/0001-55");
        pessoaJuridica.setEndereco("Rua Cassio Almeida n° 346");

        pessoaJuridica.relatorioJuridica();


    }

}
