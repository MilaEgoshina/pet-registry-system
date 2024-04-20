package Final;

import Final.controller.AnimalController;
import Final.interfaces.RepositoryInterface;
import Final.model.Animal;
import Final.repository.AnimalRepository;
import Final.userinterface.Menu;

public class PetRegistrySystem {

    public static void main(String[] args) throws Exception {

        RepositoryInterface <Animal> animals = new AnimalRepository();
        AnimalController animalController = new AnimalController(animals);

        Menu menu = new Menu(animalController);
        menu.start();
    }
    
}
