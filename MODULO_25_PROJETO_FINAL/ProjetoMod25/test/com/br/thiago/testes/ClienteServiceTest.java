package com.br.thiago.testes;


import dao.ClienteDaoMock;
import dao.IClienteDAO;
import main.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.ClienteService;
import services.IClienteService;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    //método que executa antes de qualquer outra parte do código
    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Thiago");
        cliente.setCpf(123123123L);
        cliente.setEndereco("Rua dois");

    }
        @Test
        public void pesquisarCliente() {

            Cliente clienteConsultado = clienteService.buscarCPF(cliente.getCpf());

            Assert.assertNotNull(clienteConsultado);
        }
        @Test
        public void salvarCliente(){
            Boolean retornoSave = clienteService.salvar(cliente);
            Assert.assertTrue(retornoSave);
        }
        @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());

        }
    @Test
    public void alterarCliente(){
        cliente.setNome("Ana");
        clienteService.alterar(cliente);
        Assert.assertEquals("Ana", cliente.getNome());
    }

    }
