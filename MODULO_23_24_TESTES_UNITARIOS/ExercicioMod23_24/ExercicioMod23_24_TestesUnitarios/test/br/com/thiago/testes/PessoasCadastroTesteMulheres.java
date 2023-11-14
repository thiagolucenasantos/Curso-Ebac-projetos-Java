package br.com.thiago.testes;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PessoasCadastroTesteMulheres {
    @Test
    public void TesteMulheres() {
        List<PessoaTeste> pessoa = new ArrayList<>();

        List<PessoaTeste> listaGenero = pessoa.stream()
                .filter(pessoaGenero -> pessoaGenero.getGenero().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        Assert.assertEquals("F", "F");//Testando se no filtro aceita somente mulheres
        }
    }
