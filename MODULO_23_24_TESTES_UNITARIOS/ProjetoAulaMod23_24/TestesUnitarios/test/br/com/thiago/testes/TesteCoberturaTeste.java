package br.com.thiago.testes;

import org.junit.Assert;
import org.junit.Test;
import src.main.TesteCobertura;

public class TesteCoberturaTeste {
    @Test // NÃO PODE ESQUECER @Test, porque se não, não funcionará
    public void testeCobertura(){
        TesteCobertura cobertura = new TesteCobertura();
        cobertura.adicionarNome("Thiago");

        Assert.assertEquals("Thiago", cobertura.getNome());
    }
}
