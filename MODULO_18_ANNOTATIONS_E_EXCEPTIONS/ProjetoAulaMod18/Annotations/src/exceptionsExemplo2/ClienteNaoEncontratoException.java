package exceptionsExemplo2;

public class ClienteNaoEncontratoException extends Exception{
    public ClienteNaoEncontratoException(String msg){
        super(msg);
    }
}
