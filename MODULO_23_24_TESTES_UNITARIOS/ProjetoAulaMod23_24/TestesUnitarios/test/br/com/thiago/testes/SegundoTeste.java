package br.com.thiago.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {
    @Test
    public void teste2() {
        String cidade = "São Paulo";
        Assert.assertEquals("Rio de Janeiro", cidade);
    }
}
