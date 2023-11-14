package mocks;

import ExemplosTestesMoc.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {
    @Override
    public String salvar() {
        return "Salvo";
    }

    @Override
    public String buscar() {
        return null;
    }

    @Override
    public String excluir() {
        return null;
    }

    @Override
    public String atualizar() {
        return null;
    }
}
