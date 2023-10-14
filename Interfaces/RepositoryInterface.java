package Final.Interfaces;

import java.io.IOException;
import java.time.LocalDate;

import Final.Model.AnimalType;

public interface RepositoryInterface<T>{

    public void getAll();
    public T getById(int id);
    public String getCommands(int id);
    public boolean create(AnimalType type, String name, LocalDate date);
    public boolean update(T item);  
    public boolean delete(T item); 
    public boolean addNewCommand(int id, String command);


    
}
