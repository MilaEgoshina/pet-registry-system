package Final.Model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Animal{

    private String name;
    private ArrayList<String> commands = new ArrayList<String>();
    private LocalDate dateOfBirth;

    public Animal(String name, LocalDate date){
        this.name = name;
        this.dateOfBirth = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        return commands.toString();
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

    
}
