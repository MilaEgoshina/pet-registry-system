package Final.Model.PackAnimals;

import java.time.LocalDate;

import Final.Interfaces.LearnNewCommand;
import Final.Model.Animal;

public class PackAnimal extends Animal implements LearnNewCommand{

    public PackAnimal(String name, LocalDate date) {
        super(name, date);
    }

    @Override
    public boolean learnNewCommand(String newCommamd) {

        System.out.println("Вы можете придумать новую команду для вьючного животного.");
        this.setCommands(newCommamd);
        return true;
    }

    @Override
    public String toString() {
        return "Pack Animal {" +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
