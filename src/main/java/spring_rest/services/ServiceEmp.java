package spring_rest.services;

import java.util.List;

public interface ServiceEmp<T>{
    public List<T> getAll();
    public void delete(int id);
    public void update(T obj);
    public T add(T obj);
    public T getById(int id);


}
