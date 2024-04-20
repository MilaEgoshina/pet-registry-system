package Final.model.PackAnimals;

import java.time.LocalDate;

public class Donkey extends PackAnimal{

    public Donkey(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Donkey {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
