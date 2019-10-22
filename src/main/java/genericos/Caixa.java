package genericos;

public class Caixa<T> {
    private T dado;

    public void setDado(T obj){
       this.dado = obj;
    }

    public T getDado() {
        return dado;
    }
}
