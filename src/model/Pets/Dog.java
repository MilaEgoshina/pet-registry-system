package src.model.Pets;

import java.time.LocalDate;

/**
 * This class represents a Dog - class, which is a type of Pets.
 * It extends the Pets class and provides specific behavior for a Dog.
 */
public class Dog extends Pet{

    /**
     * Constructor for creating a Dog object with a name and date of birth.
     *
     * @param name the name of the Dog.
     * @param date the date of birth of the Dog.
     */
    public Dog(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Dog {" +
                "id = " + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
