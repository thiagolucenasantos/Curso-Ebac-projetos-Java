package exceptions.exemploExceptionsPrograminhaSaque;

public class ExemploThrow {

    //Forma correta de se tratar um erro
    public static void saque(double valor) throws LimiteSaqueException{
        if (valor > 400){
            LimiteSaqueException erro = new LimiteSaqueException("Valor solicitado é maior que seu limite diário!!.");
            throw erro;
        }else {
            System.out.println("Valor retirado da cnta: " + valor);
        }
    }
    public static void saqueRuntimeException(double valor){
        if (valor > 400){
            IllegalArgumentException erro = new IllegalArgumentException("Valor solicitado maior que limite diário.");
            throw erro;
        }else {
            System.out.println("Valor retirado da conta: " + valor);
        }
    }

}
