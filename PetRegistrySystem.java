import src.controller.AnimalController;
import src.interfaces.RepositoryInterface;
import src.model.Animal;
import src.repository.AnimalRepository;
import src.userinterface.Menu;

public class PetRegistrySystem {

    public static void main(String[] args) throws Exception {

        RepositoryInterface <Animal> animals = new AnimalRepository();
        AnimalController animalController = new AnimalController(animals);

        Menu menu = new Menu(animalController);
        menu.start();
    }
    
}
