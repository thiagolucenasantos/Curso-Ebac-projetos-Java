package br.com.thiago.dao;

import br.com.thiago.domain.Cliente;

import java.util.*;

public class ClienteMapDao implements IClienteDao{

               //chave, valor
    private Map<Long, Cliente> map; // inserindo um Map
    public ClienteMapDao(){

        this.map = new HashMap<>(); // instanciando o map no construtor
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        //caso o cpf já esteja cadastrado, retorna falso, não entra nesse if
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }//caso não essteja adiciona o cpf do cliente
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if (clienteCadastrado != null){
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }

    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastro = this.map.get(cliente.getCpf());
        if (clienteCadastro !=null){
            clienteCadastro.setNome(cliente.getNome());
            clienteCadastro.setTel(cliente.getTel());
            clienteCadastro.setNumero(cliente.getNumero());
            clienteCadastro.setEnd(cliente.getEnd());
            clienteCadastro.setCidade(cliente.getCidade());
            clienteCadastro.setEstado(cliente.getEstado());
        }

    }

    @Override
    public Cliente consultar(Long cpf) {
        // se estiver cadastrado ele retorna, se não retorna nulo
        return this.map.get(cpf);
    }
    @Override
    public Collection<Cliente> buscarTodos() {

        return this.map.values();

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteMapDao that = (ClienteMapDao) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

}

