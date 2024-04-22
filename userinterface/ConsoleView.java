package Final.userinterface;

import java.util.List;
import java.util.Scanner;

import Final.model.Animal;

/**
 * Class, which is representing a console view for interacting with and displaying Animal data.
 */
public class ConsoleView implements View<Animal>{

    /**
     * Scanner object for reading user input.
     */
    public Scanner scanner;

    /**
     * Constructor to initialize a new ConsoleView object with a Scanner.
     */
    public ConsoleView(){
        this.scanner = new Scanner(System.in);
    }

    /**
     * Gets the user's input for the animal's name.
     *
     * @return the name of the animal entered by the user
     */
    @Override
    public String getUserName() {
        System.out.printf("Введите имя животного: ");
        return scanner.nextLine();
    }

    /**
     * Gets the user's input for the animal's date of birth.
     *
     * @return the date of birth of the animal entered by the user
     */
    @Override
    public String getUserDate() {
        System.out.printf("Введите дату рождения в формате 'dd.mm.yyyy': ");
        return scanner.nextLine();
    }

    /**
     * Prints all animals in the given collection.
     *
     * @param collection the list of animals to be printed
     * @param myClass the class type of the items in the collection
     */
    @Override
    public <T> void printAllAnimals(List<T> collection, Class<T> myClass) {
            System.out.print("\033[H\033[J");
            if (collection.isEmpty())
                System.out.println("список пуст");
            else {
                if (myClass == Animal.class)
                    System.out.println("\nВот все наши животные:");
                for (T item : collection) {
                    System.out.println(item);              
                }
            }
    }

    /**
     * Displays a message to the user.
     *
     * @param msg the message to be displayed
     */
    @Override
    public void showMessage(String msg) {
        System.out.println(msg);
    }
    
}
