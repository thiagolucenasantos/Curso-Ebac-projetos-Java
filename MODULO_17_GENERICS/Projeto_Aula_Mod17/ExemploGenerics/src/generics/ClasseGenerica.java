package generics;

public class ClasseGenerica<T>{
    private T data;
    public ClasseGenerica(T data){
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
