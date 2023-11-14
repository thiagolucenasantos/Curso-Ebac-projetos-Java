package exceptionsExemplo2;

public class ClienteService {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontratoException {
        //buscar no banco
        boolean cadastroCliente = false;
       if (!cadastroCliente){
            throw new ClienteNaoEncontratoException("Cliente não encontrado!.");
        }
    }
}
