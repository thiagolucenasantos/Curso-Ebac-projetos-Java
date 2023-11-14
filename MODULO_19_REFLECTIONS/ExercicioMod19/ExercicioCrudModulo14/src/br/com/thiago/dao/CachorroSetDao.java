package br.com.thiago.dao;

import br.com.thiago.domain.Cachorro;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CachorroSetDao implements ICachorroDao {
    private Set<Cachorro> set;

    public CachorroSetDao() {
        this.set = new HashSet<>();
    }


    @Override
    public Boolean cadastrar(Cachorro cachorro) {
        return this.set.add(cachorro);
    }

    @Override
    public void excluir(String codigo) {
        Cachorro cachorroEncontrado = null;
        for (Cachorro cachorro : this.set) {
            if (cachorro.getCodigo().equals(codigo)) {
                cachorroEncontrado = cachorro;
                break;
            }
        }
        if (cachorroEncontrado != null) {
            this.set.remove(cachorroEncontrado);
        }
    }

    @Override
    public void alterar(Cachorro cachorro) {
        if (this.set.contains(cachorro)){
            for (Cachorro cachorroCadastrado : this.set){
                if (cachorroCadastrado.equals(cachorro)){
                    cachorroCadastrado.setCodigo(cachorro.getCodigo());
                    cachorroCadastrado.setNome((cachorro.getNome()));
                    cachorroCadastrado.setRaca(cachorro.getRaca());
                }
            }
        }
    }

    @Override
    public Cachorro consultar(String nome) {
        for (Cachorro cachorroCadastrado : this.set){
            if (cachorroCadastrado.getNome().equals(nome)){
                return cachorroCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cachorro> buscarTodos() {
        return this.set;
    }
}
