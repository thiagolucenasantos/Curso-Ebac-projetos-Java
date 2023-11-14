package exceptions.exemploExceptionsPrograminhaSaque;

public class ExemploApp {
    public static void main(String[] args) {
        exception();
        runtimeException();
    }

    private static void runtimeException() {
        ExemploThrow.saqueRuntimeException(500);
    }


   // Forma correta de se tratar um erro
    private static void exception() {
        try {
            ExemploThrow.saque(500);
        }catch (LimiteSaqueException a){
            System.out.println("Erro: " + a.getMessage());
        }
    }
}
