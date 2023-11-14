package br.com.thiago.testes;

//CLASSE COM BIBLIOTECAS IMPORTADAS PARA RODAR TODOS OS TESTES DE UMA SÓ VEZ

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({PrimeiroTesteTest.class, SegundoTeste.class, TesteCoberturaTeste.class})
public class AllTestes {

}
