package Final.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Final.Interfaces.RepositoryInterface;
import Final.Model.Animal;
import Final.Model.AnimalCreator;
import Final.Model.AnimalType;
import Final.Model.Creator;

public class AnimalRepository implements RepositoryInterface<Animal>{

    private List<Animal> animals;
    private Creator animalCreator;

    public AnimalRepository(){

        this.animals = new ArrayList<>();
        this.animalCreator = new AnimalCreator();

    }

    public List<Animal> getAllAnimals(){
        return this.animals;
    }

    @Override
    public Animal getById(int id) {

        for(Animal animal : animals){
            if(animal.getId() == id){
                return animal;
            }

        }
        return null;
    }

    @Override
    public String getCommands(int id) {

        Animal animal = getById(id);
        return animal.getCommands().toString();

    }

    @Override
    public boolean create(AnimalType type, String name, LocalDate date){

        Animal animal = animalCreator.createNewAnimal(type, name,date);
        animals.add(animal);
        return true;
    }

    @Override
    public boolean update(Animal item) {

        for(Animal animal : animals){
            if(animal.equals(item)){

                animal.setName(item.getName());
                animal.setDateOfBirth(item.getDateOfBirth());
                animal.setId(item.getId());
                return true;
                
            }
        }

        return false;
    }

    @Override
    public boolean delete(Animal animal) {

        animals.remove(animal);
        return true;
    }

    @Override
    public boolean addNewCommand(int id, String command) {

        Animal animal = getById(id);
        animal.learnNewCommand(command);
        return true;
    }

    @Override
    public void getAll() {
        for(Animal animal : animals){
            System.out.println(animal.toString());
        }
    }
    
}
