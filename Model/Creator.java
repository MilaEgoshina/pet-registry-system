package Final.Model;

import java.time.LocalDate;

public abstract class Creator {

    protected abstract Animal createNewAnimal(AnimalType type,String name, LocalDate date);

    public Animal createAnimal(AnimalType type, String name, LocalDate date){
        
        Animal animal = createNewAnimal(type,name,date);
        return animal;

    }
}
