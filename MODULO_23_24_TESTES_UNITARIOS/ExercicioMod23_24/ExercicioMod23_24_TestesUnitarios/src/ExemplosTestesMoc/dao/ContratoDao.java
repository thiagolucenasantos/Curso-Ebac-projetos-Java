package ExemplosTestesMoc.dao;

public class ContratoDao implements IContratoDao{

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona o banco");
    }

    @Override
    public String buscar() {
        return "Buscado com sucesso";
    }

    @Override
    public String excluir() {
        return "Excluido com sucesso";
    }

    @Override
    public String atualizar() {
        return "Atualizado com sucesso";
    }
}
