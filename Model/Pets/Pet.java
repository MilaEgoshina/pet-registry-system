package Final.Model.Pets;

import java.time.LocalDate;

import Final.Interfaces.LearnNewCommand;
import Final.Model.Animal;

public class Pet extends Animal implements LearnNewCommand{

    public Pet(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public boolean learnNewCommand(String newCommamd) {

        System.out.println("Вы можете придумать новую команду для домашнего животного.");
        this.setCommands(newCommamd);
        return true;
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
