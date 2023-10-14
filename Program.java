package Final;

import Final.Controller.AnimalController;
import Final.Interfaces.RepositoryInterface;
import Final.Model.Animal;
import Final.Repository.AnimalRepository;
import Final.UserInterface.Menu;

public class Program {

    public static void main(String[] args) throws Exception {

        RepositoryInterface <Animal> animals = new AnimalRepository();
        AnimalController animalController = new AnimalController(animals);

        Menu menu = new Menu(animalController);
        menu.start();
    }
    
}
