package Final.model.Pets;

import java.time.LocalDate;

/**
 * This class represents a Hamster - class, which is a type of Pets.
 * It extends the Pets class and provides specific behavior for a Hamster.
 */
public class Hamster extends Pet{

    /**
     * Constructor for creating a Hamster object with a name and date of birth.
     *
     * @param name the name of the Hamster.
     * @param date the date of birth of the Hamster.
     */
    public Hamster(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Hamster {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
