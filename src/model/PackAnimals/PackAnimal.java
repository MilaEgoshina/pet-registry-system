package src.model.PackAnimals;

import java.time.LocalDate;

import src.model.Animal;

/**
 * This class represents a PackAnimal, which is a type of Animal that can learn new commands.
 * It extends the Animal class and provides functionality specific to pets.
 */
public class PackAnimal extends Animal{

    /**
     * Constructor for creating a PackAnimal object with a name and date of birth.
     *
     * @param name the name of the pack animal
     * @param date the date of birth of the pack animal
     */
    public PackAnimal(String name, LocalDate date) {
        super(name, date);
    }


    @Override
    public String toString() {
        return "Pack Animal {" +
                "id = " + super.getId()  + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
