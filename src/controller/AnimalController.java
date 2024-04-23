package src.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import src.interfaces.RepositoryInterface;
import src.model.Animal;
import src.model.AnimalType;
import src.userinterface.ConsoleView;
import src.userinterface.View;

/**
 * Class is responsible for controlling the actions related to animals, such as creating, updating, deleting,
 * and training animals.
 */
public class AnimalController {

    private RepositoryInterface<Animal> animalRepository;
    private View<Animal> view;
    private Validator validator;

    /**
     * Constructor for AnimalController class.
     * @param repository An instance of RepositoryInterface for storing and managing animals.
     */
    public AnimalController(RepositoryInterface<Animal> repository){
        this.animalRepository = repository;
        this.view = new ConsoleView();
        this.validator = new Validator();
    }

    /**
     * Method to create a new animal of a specified type.
     * @param type The type of animal to create.
     */
    public void createMyAnimal(AnimalType type){

        String[] data = new String[]{view.getUserName(),view.getUserDate()};
        validator.validate(data);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(data[1],formatter);
        try{

            boolean result = animalRepository.create(type, data[0],date);
            view.showMessage(String.format("%b Животное создано: ", result));
        }catch(RuntimeException e){
            view.showMessage(e.getMessage());
        }
    }

    /**
     * Method to update an existing animal's information.
     * @param id The ID of the animal to update.
     */
    public void updateMyAnimal(int id){
        
        Animal animal = getAnimalById(id);
        String[] data = new String[] {view.getUserName(),view.getUserDate()};
        validator.validate(data);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(data[1], formatter);
        animal.setName(data[0]);
        animal.setDateOfBirth(date);
        // try{
        //     boolean result = animalRepository.update(animal);
        //     view.showMessage(String.format("%b Данные о животным успешно изменены: ", result));
        // } catch (Exception e) {
        //     view.showMessage(e.getMessage());
        // }
    }

    /**
     * Method to get an animal by its ID.
     * @param id The ID of the animal to retrieve.
     * @return The animal with the specified ID.
     */
    public Animal getAnimalById(int id){
        try{

            return animalRepository.getById(id);
        }catch(RuntimeException ex){
            view.showMessage(ex.getMessage());
        }

        return null;
    }
    /**
     * Method to retrieve all animals stored in the repository and display them.
     */
    public void getAllMyAnimals(){
        try {

            view.printAllAnimals(animalRepository.getAllAnimals(), Animal.class);
        }catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }
    }

    /**
     * Method to train an animal with a new command.
     * @param id The ID of the animal to train.
     * @param command The command to train the animal with.
     * @return True if the command was successfully trained, false otherwise.
     */
    public boolean trainAnimal(int id, String command){

        try {

            if(animalRepository.getCommands(id).contains(command)){
                view.showMessage("Эту команду животное уже умеет выполнять");
            }else{
                animalRepository.addNewCommand(id, command);
                view.showMessage("Команда выучена");
                return true;
            }
            
        } catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }

        return false;
    }

    /**
     * Method to delete an animal by its ID.
     * @param id The ID of the animal to delete.
     */
    public void deleteMyAnimal(int id){
        try {
            
            animalRepository.delete(id);
        } catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }
    }

    /**
     * Method to get all the commands trained for a specific animal.
     *  @param id The ID of the animal to retrieve commands for.
     */
    public void getCommands(int id){

        try {

            view.printAllAnimals(animalRepository.getCommands(id), String.class);
            
        } catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }
    }
}
