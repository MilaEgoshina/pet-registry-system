package Final.model;

import java.time.LocalDate;

/**
 * This abstract class represents a creator that can create new animals.
 */
public abstract class Creator {

    /**
     * Creates a new animal of the specified type with the given name and birthdate.
     *
     * @param type the type of animal to create
     * @param name the name of the animal
     * @param date the birthdate of the animal
     * @return the newly created Animal object
     */
    public abstract Animal createNewAnimal(AnimalType type,String name, LocalDate date);

}
