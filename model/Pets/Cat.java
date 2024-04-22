package Final.model.Pets;

import java.time.LocalDate;

/**
 * This class represents a Cat - class, which is a type of Pets.
 * It extends the Pets class and provides specific behavior for a Cat.
 */
public class Cat extends Pet{

    /**
     * Constructor for creating a Cat object with a name and date of birth.
     *
     * @param name the name of the Cat.
     * @param date the date of birth of the Cat.
     */
    public Cat(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
