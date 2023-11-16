package com.br.thiago.testes;

import dao.ClienteDao;
import dao.ClienteDaoMock;
import dao.IClienteDAO;
import main.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;
    private Cliente cliente;
    public ClienteDAOTest(){
        clienteDAO = new ClienteDaoMock();
    }
    //método que executa antes de qualquer outra parte do código
    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Thiago");
        cliente.setCpf(123123123L);
        cliente.setEndereco("Rua dois");

        clienteDAO.salvar(cliente);
    }
    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.buscarCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente(){
        Boolean retornoSave = clienteDAO.salvar(cliente);
        Assert.assertTrue(retornoSave);
    }
    @Test
    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCpf());

    }
    @Test
    public void alterarCliente(){
        cliente.setNome("Ana");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("Ana", cliente.getNome());
    }

}
