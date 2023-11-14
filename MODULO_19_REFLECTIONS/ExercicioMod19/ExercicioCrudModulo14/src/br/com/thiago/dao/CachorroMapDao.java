package br.com.thiago.dao;

import br.com.thiago.domain.Cachorro;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CachorroMapDao implements ICachorroDao {

    private Map<String, Cachorro> map;

    public CachorroMapDao() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cachorro cachorro) {
        if (this.map.containsKey(cachorro.getNome())) {
            return false;
        }
        this.map.put(cachorro.getNome(), cachorro);
        return true;
    }

    @Override
    public void excluir(String nome) {
        Cachorro cachorroCadastrado = this.map.get(nome);
        if (cachorroCadastrado != null) {
            this.map.remove(cachorroCadastrado.getNome(), cachorroCadastrado);
        }

    }

    @Override
    public void alterar(Cachorro cachorro) {
        Cachorro cachorroCadastrado = this.map.get(cachorro.getCodigo());
        if (cachorroCadastrado != null) {
            cachorroCadastrado.setCodigo(cachorro.getCodigo());
            cachorroCadastrado.setNome((cachorro.getNome()));
            cachorroCadastrado.setRaca(cachorro.getRaca());
        }
    }

    @Override
    public Cachorro consultar(String nome) {
        return this.map.get(nome);
    }

    @Override
    public Collection<Cachorro> buscarTodos() {
        return this.map.values();
    }
}
