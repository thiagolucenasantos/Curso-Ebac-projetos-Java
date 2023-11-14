package exceptions;

public class ExemploExceptions {

    public static void main(String[] args) {
        ExemploRuntimeException();

        String frase  = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e){ // OBS: NUNCA TRATAR DESSA FORMA O NULLPOINTEREXCEPTION
            //Tratamento do erro exceção
            System.out.println("A frase inicia está nula, foi atribuido um valor a variável frase");
            frase = "Frase cheia";
        }finally { //finally será sempre executado
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase Antiga: " + frase);
        System.out.println("Nova Frase: " + novaFrase);
    }

    private static void ExemploRuntimeException() {
        //ele literalmente para o sistema não deixando executar mais nada
        try {
            String frase = null;
            String novafrase = null;
            novafrase = frase.toUpperCase();
        }catch (Exception e){
            throw new RuntimeException("Parando  o sistema");
        }
        System.out.println("Teste");
    }
}
