package br.com.thiago.testes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * O teste unitário é uma verificação feita com uma pequena porção de código,
 * uma unidade de um software. Ou seja, é diferente do teste geral, que se dedica
 * a atestar o fluxo do sistema, com as funcionalidades principais.
 */

public class PrimeiroTesteTest {
    @Test
    public void primeiroTeste() {
    String nome = "Thiago";
        Assert.assertEquals("Thiago",nome);
    }
}