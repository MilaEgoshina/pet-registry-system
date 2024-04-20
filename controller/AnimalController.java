package Final.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Final.interfaces.RepositoryInterface;
import Final.model.Animal;
import Final.model.AnimalType;
import Final.userinterface.ConsoleView;
import Final.userinterface.View;

public class AnimalController {

    private RepositoryInterface<Animal> animalRepository;
    private View<Animal> view;
    private Validator validator;

    public AnimalController(RepositoryInterface<Animal> repository){
        this.animalRepository = repository;
        this.view = new ConsoleView();
        this.validator = new Validator();
    }

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

    public Animal getAnimalById(int id){
        try{

            return animalRepository.getById(id);
        }catch(RuntimeException ex){
            view.showMessage(ex.getMessage());
        }

        return null;
    }

    public void getAllMyAnimals(){
        try {

            view.printAllAnimals(animalRepository.getAllAnimals(), Animal.class);
        }catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }
    }

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

    public void deleteMyAnimal(int id){
        try {
            
            animalRepository.delete(id);
        } catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }
    }

    public void getCommands(int id){

        try {

            view.printAllAnimals(animalRepository.getCommands(id), String.class);
            
        } catch (RuntimeException e) {
            view.showMessage(e.getMessage());
        }
    }
}
