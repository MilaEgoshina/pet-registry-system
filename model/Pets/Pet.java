package Final.model.Pets;

import java.time.LocalDate;


import Final.model.Animal;

public class Pet extends Animal{

    public Pet(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public String toString() {
        return "Pet {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
