package br.com.thiago.testes;

import ExemplosTestesMoc.dao.ClienteDaoMock;
import ExemplosTestesMoc.dao.IClienteDao;
import ExemplosTestesMoc.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTestMoc {
    @Test
    public void salvartest(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso",retorno );
    }
}
