package src.model.PackAnimals;

import java.time.LocalDate;

import src.interfaces.LearnNewCommand;
import src.model.Animal;

/**
 * This class represents a PackAnimal, which is a type of Animal that can learn new commands.
 * It extends the Animal class and implements the LearnNewCommand interface to provide functionality for learning new commands.
 */
public class PackAnimal extends Animal implements LearnNewCommand{

    /**
     * Constructor for creating a PackAnimal object with a name and date of birth.
     *
     * @param name the name of the pack animal
     * @param date the date of birth of the pack animal
     */
    public PackAnimal(String name, LocalDate date) {
        super(name, date);
    }

    /**
     * Allows the pack animal to learn a new command.
     *
     * @param newCommand the new command to be learned by the pack animal
     * @return true if the command was successfully learned, false otherwise
     */
    @Override
    public boolean learnNewCommand(String newCommand) {

        System.out.println("Вы можете придумать новую команду для вьючного животного.");
        this.setCommands(newCommand);
        return true;
    }

    @Override
    public String toString() {
        return "Pack Animal {" +
                "id = " + super.getId()  + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
    
}
