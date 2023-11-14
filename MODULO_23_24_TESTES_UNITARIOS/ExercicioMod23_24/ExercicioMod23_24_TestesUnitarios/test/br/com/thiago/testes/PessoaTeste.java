package br.com.thiago.testes;

public class PessoaTeste {
    private String nome;
    private String genero;

    public PessoaTeste(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public PessoaTeste() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}


