package exceptions.exemploExceptionsPrograminhaSaque;
//extendendo para a classe Exception da própria biblioteca Java
public class LimiteSaqueException extends Exception{
    public LimiteSaqueException(String msg){
        super(msg);
    }
}
