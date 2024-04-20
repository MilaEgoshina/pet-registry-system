package Final.model.PackAnimals;

import java.time.LocalDate;

import Final.interfaces.LearnNewCommand;
import Final.model.Animal;

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
