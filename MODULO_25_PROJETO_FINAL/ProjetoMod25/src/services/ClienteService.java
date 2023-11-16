package services;

import dao.IClienteDAO;
import main.domain.Cliente;

public class ClienteService implements IClienteService {
    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarCPF(Long cpf) {
        return clienteDAO.buscarCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {
    }

    @Override
    public void alterar(Cliente cliente) {

    }

}
