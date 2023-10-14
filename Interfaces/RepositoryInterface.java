package Final.Interfaces;

import java.time.LocalDate;
import java.util.List;

import Final.Model.AnimalType;

public interface RepositoryInterface<T>{

    public List<T> getAllAnimals();
    public T getById(int id);
    public List<String> getCommands(int id);
    public boolean create(AnimalType type, String name, LocalDate date);
    public boolean update(T item);  
    public boolean delete(int id); 
    public boolean addNewCommand(int id, String command);


    
}
