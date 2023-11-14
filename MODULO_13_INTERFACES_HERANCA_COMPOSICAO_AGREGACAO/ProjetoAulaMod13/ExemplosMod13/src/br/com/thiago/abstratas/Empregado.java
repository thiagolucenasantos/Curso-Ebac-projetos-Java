package br.com.thiago.abstratas;

//Diferente da Interface podemos implementar propriedades como vemos a baixo
//classe Empregado sendo abstract significa que ela é a classe pai
public  abstract class Empregado { // método abstract pai
    private String nome;
    private String sobrenome;
    private String cpf;
    public abstract Double vencimento();

    public String getNome() {
        return nome;
    }

    public void imprimirValores(){
        Double valor = vencimento();
        System.out.println("O valor de salário é: " + valor);
    }
    public void sobreNome(){
        System.out.println("Sobre nome: " + this.sobrenome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
