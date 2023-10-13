package Final.Interfaces;

import java.util.List;

public interface RepositoryInterface<T>{

    // public List <T> getAllAnimals();
    public T getById(int id);
    public List<String> getCommands(int id);
    public int create(T item);
    public int update(T item);  
    public void delete(int item); 
    public void addNewCommand(int id, String command);


    
}
