package ExemplosTestesMoc.dao;

//OBJETO FALSO UTILIZADO SOMENTE PARA UTILIZAR COMO TESTES, SIMULANDO O VARDADEIRO CLIENTEDAO
public class ClienteDaoMock implements IClienteDao{
    public String salvar(){
        return "Salvo";
    }
}
