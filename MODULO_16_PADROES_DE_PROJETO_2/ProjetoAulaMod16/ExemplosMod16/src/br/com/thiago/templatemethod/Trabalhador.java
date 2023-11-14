package br.com.thiago.templatemethod;

/**
 * Template method simplifica onde a classe abstrata principal recebe todos os métodos
 * necessários e assim extendendo para as demais classes utilizarem, somente sendo alterada
 * as classes abstratas nas demais classes necessárias, como no exemplo nosso o método
 * trabalhar() que se encontra abstract, os métodos protects também podemos sobrescrever.
 */
public abstract class Trabalhador {
    public void executarRotina() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltar para casa");
    }

    private void irAoTrabalho() {
        System.out.println("Ir ao Trabalho");
    }

    private void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    private void levantar() {
        System.out.println("Levantando");
    }
}
