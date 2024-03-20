package l44_app_arch.mvc.models;

public interface IRepository <T>{
    public T get(String id);

    void put(String id, T obj);
}