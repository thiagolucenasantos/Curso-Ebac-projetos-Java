package br.com.thiago.dao;

import br.com.thiago.domain.Cachorro;

import java.util.Collection;


public interface ICachorroDao {
    public Boolean cadastrar(Cachorro cachorro);
    public void excluir(String nome);
    public void alterar(Cachorro cachorro);
    public Cachorro consultar(String nome);
    public Collection<Cachorro> buscarTodos();

}
