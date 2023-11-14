package br.com.thiago.SingletonPropriedadeThread;

//CLasse criada para garantir que a Thread seja acessada sincronizada,
//de modo que garante que será passado apenas um valor ao parâmetro
public class SingletonPropriedadeThreadSincronizado {
    private static SingletonPropriedadeThreadSincronizado singleton;
    private String value;
    private SingletonPropriedadeThreadSincronizado(String value){
        this.value = value;
    }
    // o que garanti é colocar no método o synchronized
    public static synchronized SingletonPropriedadeThreadSincronizado getInstance(String value){
        if (singleton == null){
            singleton = new SingletonPropriedadeThreadSincronizado(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
