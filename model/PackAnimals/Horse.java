package Final.model.PackAnimals;

import java.time.LocalDate;

public class Horse extends PackAnimal{

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
