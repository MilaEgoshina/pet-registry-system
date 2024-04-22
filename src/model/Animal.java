package src.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import src.interfaces.LearnNewCommand;

/**
 * Class, which represents an animal with a name, commands it knows, and its date of birth.
 */
public class Animal implements LearnNewCommand{

    private int id;
    private static int idCounter = 0;
    private String name;
    private List<String> commands;
    private LocalDate dateOfBirth;

    /**
     * Constructor to create an Animal with a given name and date of birth.
     *
     * @param name the name of the animal
     * @param date the date of birth of the animal
     */
    public Animal(String name, LocalDate date){
        this.id = idCounter++;
        this.name = name;
        this.dateOfBirth = date;
        this.commands = new ArrayList<>();
    }

    /**
     * Set the ID of the animal.
     *
     * @param petId the ID to set
     */
    public void setId(int petId) {
        this.id = petId;
    }

    /**
     * Get the ID of the animal.
     *
     * @return the ID of the animal
     */
    public int getId() {
        return id;
    }

    /**
     * Get the name of the animal.
     *
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the animal.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the list of commands the animal knows.
     *
     * @return the list of commands
     */
    public List<String> getCommands() {
        return commands;
    }

    /**
     * Add a new command to the list of commands the animal knows.
     *
     * @param commands the command to add
     */
    public void setCommands(String commands) {
        this.commands.add(commands);
    }

    /**
     * Get the date of birth of the animal.
     *
     * @return the date of birth of the animal
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Set the date of birth of the animal.
     *
     * @param dateOfBirth the date of birth to set
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "Animal {" +
                "id = " + id + '\'' +
                "name = '" + name + '\'' +
                ", commands = " + commands.toString() +
                ", dateOfBirth = '" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean learnNewCommand(String newCommand) {

        System.out.println("Вы можете придумать новую команду для животного.");
        this.setCommands(newCommand);
        return true;
    }

    
}
