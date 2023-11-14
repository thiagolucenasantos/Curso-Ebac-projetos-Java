package ExemplosTestesMoc.service;

import ExemplosTestesMoc.dao.IContratoDao;

public class ContratoService implements IContratoService {
    public IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        contratoDao.salvar();
      this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        return null;
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
