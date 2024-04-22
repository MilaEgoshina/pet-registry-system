package Final.model.PackAnimals;

import java.time.LocalDate;

/**
 * This class represents a Horse - class, which is a type of PackAnimal.
 * It extends the PackAnimal class and provides specific behavior for a Horse.
 */
public class Horse extends PackAnimal{

    /**
     * Constructor for creating a Horse object with a name and date of birth.
     *
     * @param name the name of the horse.
     * @param date the date of birth of the horse.
     */
    public Horse(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Horse {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
