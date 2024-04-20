package Final.model.PackAnimals;

import java.time.LocalDate;

public class Camel extends PackAnimal{

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
