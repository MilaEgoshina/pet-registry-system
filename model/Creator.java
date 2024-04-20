package Final.model;

import java.time.LocalDate;

public abstract class Creator {

    public abstract Animal createNewAnimal(AnimalType type,String name, LocalDate date);

}
