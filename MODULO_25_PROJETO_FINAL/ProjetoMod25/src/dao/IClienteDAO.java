package dao;

import main.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);
    Cliente buscarCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
