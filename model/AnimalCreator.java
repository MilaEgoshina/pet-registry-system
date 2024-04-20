package Final.model;

import java.time.LocalDate;

import Final.model.PackAnimals.Camel;
import Final.model.PackAnimals.Donkey;
import Final.model.PackAnimals.Horse;
import Final.model.Pets.Cat;
import Final.model.Pets.Dog;
import Final.model.Pets.Hamster;

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
    

