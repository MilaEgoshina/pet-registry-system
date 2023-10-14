package Final.Model;

import java.time.LocalDate;

import Final.Model.PackAnimals.Camel;
import Final.Model.PackAnimals.Donkey;
import Final.Model.PackAnimals.Horse;
import Final.Model.Pets.Cat;
import Final.Model.Pets.Dog;
import Final.Model.Pets.Hamster;

public class AnimalCreator extends Creator{

    @Override
    public Animal createNewAnimal(AnimalType type, String name, LocalDate date) {

          switch (type) {
            case Cat:
                return new Cat(name,date);
            case Dog:
                return new Dog(name,date);
            case Hamster:
                return new Hamster(name,date);
            case Horse:
                return new Horse(name, date);
            case Camel:
                return new Camel(name, date);
            case Donkey:
                return new Donkey(name, date);
            default:
                System.out.println("Такого животного здесь нет.");
                break;
        }
        return null;
    }
}
    

