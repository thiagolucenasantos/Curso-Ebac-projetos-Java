package br.com.thiago.domain;

import java.util.Objects;

public class Cachorro {

    private Long codigo;
    private String nome;
    private String raca;


    public Cachorro(String codigo, String nome, String raca) {
        this.codigo = Long.valueOf(codigo.trim());
        this.nome = nome;
        this.raca = raca;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachorro cachorro = (Cachorro) o;
        return Objects.equals(codigo, cachorro.codigo) && Objects.equals(nome, cachorro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
