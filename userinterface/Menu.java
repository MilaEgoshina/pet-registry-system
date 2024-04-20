package Final.userinterface;

import java.util.Scanner;

import Final.controller.AnimalController;
import Final.controller.Counter;
import Final.exceptions.UncorrectDataException;
import Final.model.AnimalType;

public class Menu {

    protected AnimalController animalController;

    public Menu(AnimalController animalController){
        this.animalController = animalController;
    }

    public void start() throws Exception{
        System.out.print("\033[H\033[J");

        try (Scanner in = new Scanner(System.in); Counter count = new Counter()) {

            boolean flag = true;
            int id = 0;
            while(flag){
                System.out.println(
                        "\n1 - Список всех животных\n2 - Завести новое животное\n3 - Изменить данные о животном\n4 - Что умеет животное\n5 - Дрессировка\n6 - Удалить запись\n0 - Выход");

                String input = in.nextLine();
                switch(input){
                    case "1":
                        animalController.getAllMyAnimals();
                        break;
                    case "2":
                        AnimalType type = chooseTypeMenu(in);
                        if(type != null){

                            try {
                                
                                animalController.createMyAnimal(type);
                                count.add();
                                System.out.println("Created");

                            } catch (UncorrectDataException  e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        break;

                    case "3":

                        while(true){
                            id = inputIdMenu(in);
                            if(id != 0){
                                try {
                                    
                                    animalController.updateMyAnimal(id);

                                } catch (UncorrectDataException  e) {
                                    System.out.println(e.getMessage());
                                }
                            }else{
                                break;
                            }
                        }
                        break;

                        case "4":
                            while(true){

                                id = inputIdMenu(in);
                                if(id != 0){

                                    animalController.getCommands(id);
                                }else{
                                    break;
                                }
                            }
                            break;
                        case "5":
                            id = inputIdMenu(in);
                            if(id != 0){
                                trainAnimalMenu(id, in);

                            }
                            break;
                        case "6":
                            id = inputIdMenu(in);
                            if(id != 0){
                                animalController.deleteMyAnimal(id);
                            }
                            break;
                        case "0":
                            flag = false;
                            break;
                        default:
                            System.out.println("такого варианта нет");
                            break;
                }        
            }
            
         }

    }     
    private AnimalType chooseTypeMenu(Scanner in){

        System.out.println("Какое животное добавить:\n1 - Кошка\n2 - Собака\n3 - Хомяк\n4 - Лощадь\n5 - Верблюд\n6 - Осел\n0 - Возврат в основное меню");
        while (true) {
            String input = in.next();
            switch (input) {
                case "1":
                    return AnimalType.Cat;
                case "2":
                    return AnimalType.Dog;
                case "3":
                    return AnimalType.Hamster;
                case "4":
                    return AnimalType.Horse;
                case "5":
                    return AnimalType.Camel;
                case "6":
                    return AnimalType.Donkey;
                case "0":
                    return null;
                default:
                    System.out.println("Такого варианта нет, введите число от 0 до 6");
                    break;
            }
        }
    }

    private int inputIdMenu(Scanner in){
        System.out.println("\nВведите номер животного, 0 для возврата в основное меню: ");
        while(true){
            int id = in.nextInt();
            in.nextLine();
            if (id == 0)
                return id;
            if (animalController.getAnimalById(id) == null) {
                System.out.println("Животного с таким номером нет, попробуйте еще раз, 0 для возврата в основное меню:");
            } else
                return id;
        }
    }

    private void trainAnimalMenu(int id, Scanner in){

        while (true) {
            System.out.println("Введите новую команду, 0 для возврата в основное меню: ");
            String command = in.nextLine();
            if (command.length() == 1 && command.equals("0"))
                return;
            if (animalController.trainAnimal(id, command));
                System.out.println("Command added.");
        }
    }

}
    
    

