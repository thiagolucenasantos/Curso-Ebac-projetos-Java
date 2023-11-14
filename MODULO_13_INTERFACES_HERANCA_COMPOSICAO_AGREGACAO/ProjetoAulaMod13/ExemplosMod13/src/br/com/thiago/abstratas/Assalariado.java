package br.com.thiago.abstratas;

public class Assalariado extends Empregado {// extends, significa que herda todos os atributos de empregado

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }
}
