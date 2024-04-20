package Final.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Final.interfaces.LearnNewCommand;


public class Animal implements LearnNewCommand{

    private int id;
    private static int idCounter = 0;
    private String name;
    private List<String> commands;
    private LocalDate dateOfBirth;

    public Animal(String name, LocalDate date){
        this.id = idCounter++;
        this.name = name;
        this.dateOfBirth = date;
        this.commands = new ArrayList<>();
    }

    public void setId(int petId) {
        this.id = petId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands.add(commands);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "name = '" + name + '\'' +
                ", commands = " + commands.toString() +
                ", dateOfBirth = '" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean learnNewCommand(String newCommamd) {

        System.out.println("Вы можете придумать новую команду для животного.");
        this.setCommands(newCommamd);
        return true;
    }

    
}
