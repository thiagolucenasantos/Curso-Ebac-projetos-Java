package ExemplosTestesMoc.service;

import ExemplosTestesMoc.dao.ClienteDao;
import ExemplosTestesMoc.dao.IClienteDao;

public class ClienteService{
    private ClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = (ClienteDao) clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
