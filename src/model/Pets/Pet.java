package src.model.Pets;

import java.time.LocalDate;


import src.model.Animal;

/**
 * This class represents a Pet, which is a type of Animal.
 * It extends the Animal class and provides functionality specific to pets.
 */
public class Pet extends Animal{

    /**
     * Constructor for creating a Pet object with a name and date of birth.
     *
     * @param name the name of the pet
     * @param date the date of birth of the pet
     */
    public Pet(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Pet {" +
                "id = " + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
