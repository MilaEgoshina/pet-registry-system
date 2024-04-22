package Final.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Final.interfaces.RepositoryInterface;
import Final.model.Animal;
import Final.model.AnimalCreator;
import Final.model.AnimalType;
import Final.model.Creator;

/**
 * Class which is representing a repository for managing animals.
 */
public class AnimalRepository implements RepositoryInterface<Animal>{

    private List<Animal> animals;
    private Creator animalCreator;

    /**
     * Constructs a new AnimalRepository with an empty list of animals and an AnimalCreator.
     */
    public AnimalRepository(){

        this.animals = new ArrayList<>();
        this.animalCreator = new AnimalCreator();

    }

    /**
     * Retrieves all animals stored in the repository.
     *
     * @return the list of animals
     */
    @Override
    public List<Animal> getAllAnimals(){
        return this.animals;
    }

    /**
     * Retrieves an animal by its id.
     *
     * @param id the id of the animal to retrieve
     * @return the animal with the specified id, or null if not found
     */
    @Override
    public Animal getById(int id){

        for(Animal animal : animals){
            if(animal.getId() == id){
                return animal;
            }else{
                System.out.println("Животного с таким id нет.");
                return null;
            }
        }

        return null;
    }

    /**
     * Retrieves the list of commands for an animal with the specified id.
     *
     * @param id the id of the animal
     * @return the list of commands for the animal
     */
    @Override
    public List<String> getCommands(int id) {

        Animal animal = getById(id);
        return animal.getCommands();

    }

    /**
     * Creates a new animal with the specified type, name, and birthdate.
     *
     * @param type the type of animal to create
     * @param name the name of the animal
     * @param date the birthdate of the animal
     * @return true if the animal was successfully created, false otherwise
     */
    @Override
    public boolean create(AnimalType type, String name, LocalDate date){

        Animal animal = animalCreator.createNewAnimal(type, name,date);
        animals.add(animal);
        return true;
    }

    /**
     * Updates an existing animal with the information from the specified item.
     *
     * @param item the animal with updated information
     * @return true if the update was successful, false otherwise
     */
    @Override
    public boolean update(Animal item) {

        for(Animal animal : animals){
        if(animal.equals(item)){

            animal.setName(item.getName());
            animal.setDateOfBirth(item.getDateOfBirth());
            animal.setId(item.getId());
            return true;
            
        }else{
            System.out.println("Такого животного нет, поэтому заменить его не получится");
            return false;
        }
      }

      return false;
    }

    /**
     * Deletes an animal with the specified id.
     *
     * @param id the id of the animal to delete
     * @return true if the animal was successfully deleted, false otherwise
     */
    @Override
    public boolean delete(int id) {

        Animal animal = getById(id);

        animals.remove(animal);
        return true;
    }

    /**
     * Adds a new command to the list of commands for the animal with the specified id.
     *
     * @param id the id of the animal
     * @param command the new command to add
     * @return true if the command was successfully added, false otherwise
     */
    @Override
    public boolean addNewCommand(int id, String command) {

        Animal animal = getById(id);
        animal.learnNewCommand(command);
        return true;
    }

    /**
     * Displays information about all animals in the repository.
     */
    public void getAll() {
        for(Animal animal : animals){
            System.out.println(animal.toString());
        }
    }
    
}
