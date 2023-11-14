package br.com.thiago.testes;

import ExemplosTestesMoc.dao.ContratoDao;
import ExemplosTestesMoc.dao.IContratoDao;
import ExemplosTestesMoc.service.ContratoService;
import ExemplosTestesMoc.service.IContratoService;
import mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
    @Test
    public void buscar() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceBuscar = new ContratoService(dao);
        String retorno = serviceBuscar.buscar();
        Assert.assertEquals("Buscado com sucesso", retorno);
    }
    @Test
    public void excluir() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceExcluir = new ContratoService(dao);
        String retorno = serviceExcluir.excluir();
        Assert.assertEquals("Excluido com sucesso", retorno);
    }
    @Test
    public void atualizar() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceAtualizar = new ContratoService(dao);
        String retorno = serviceAtualizar.atualizar();
        Assert.assertEquals("Atualizado com sucesso", retorno);
    }
}

