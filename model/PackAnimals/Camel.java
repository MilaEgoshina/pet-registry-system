package Final.model.PackAnimals;

import java.time.LocalDate;

/**
 * This class represents a Camel - class, which is a type of PackAnimal.
 * It extends the PackAnimal class and provides specific behavior for a Camel.
 */
public class Camel extends PackAnimal{

    /**
     * Constructor for creating a Camel object with a name and date of birth.
     *
     * @param name the name of the camel
     * @param date the date of birth of the camel
     */
    public Camel(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Camel {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
