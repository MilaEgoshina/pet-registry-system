package Final.userinterface;

import java.util.List;
import java.util.Scanner;

import Final.model.Animal;

public class ConsoleView implements View<Animal>{

    public Scanner scanner;

    public ConsoleView(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getUserName() {
        System.out.printf("Введите имя животного: ");
        return scanner.nextLine();
    }

    @Override
    public String getUserDate() {
        System.out.printf("Введите дату рождения в формате 'dd.mm.yyyy': ");
        return scanner.nextLine();
    }

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

    @Override
    public void showMessage(String msg) {
        System.out.println(msg);
    }
    
}
