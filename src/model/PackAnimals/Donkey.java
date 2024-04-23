package src.model.PackAnimals;

import java.time.LocalDate;

/**
 * This class represents a Donkey - class, which is a type of PackAnimal.
 * It extends the PackAnimal class and provides specific behavior for a Donkey.
 */
public class Donkey extends PackAnimal{

    /**
     * Constructor for creating a Donkey object with a name and date of birth.
     *
     * @param name the name of the donkey
     * @param date the date of birth of the donkey
     */
    public Donkey(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Donkey {" +
                "id = " + this.getId() + '\'' +
                "name = '" + this.getName() + '\'' +
                ", commands = " + this.getCommands() +
                ", dateOfBirth = '" + this.getDateOfBirth() + '\'' +
                '}';
    }
    
}
