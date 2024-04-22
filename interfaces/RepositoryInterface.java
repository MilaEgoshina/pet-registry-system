package Final.interfaces;

import java.time.LocalDate;
import java.util.List;

import Final.model.AnimalType;

/**
 * Interface for a generic repository.
 */
public interface RepositoryInterface<T>{

     /**
      * Get all animals in the repository.
      *
      * @return a list of all animals
      */
     List<T> getAllAnimals();

     /**
      * Get an animal by its ID.
      *
      * @param id the ID of the animal
      * @return the animal with the specified ID
      */
     T getById(int id);

     /**
      * Get a list of commands associated with a specific animal.
      *
      * @param id the ID of the animal
      * @return a list of commands for the animal
      */
     List<String> getCommands(int id);

     /**
      * Create a new animal in the repository.
      *
      * @param type the type of animal
      * @param name the name of the animal
      * @param date the date the animal was created
      * @return true if the animal was successfully created, false otherwise
      */
     boolean create(AnimalType type, String name, LocalDate date);

     /**
      * Update an existing animal in the repository.
      *
      * @param item the animal to be updated
      * @return true if the animal was successfully updated, false otherwise
      */
     boolean update(T item);

     /**
      * Delete an animal from the repository.
      *
      * @param id the ID of the animal to be deleted
      * @return true if the animal was successfully deleted, false otherwise
      */
     boolean delete(int id);

     /**
      * Add a new command for a specific animal in the repository.
      *
      * @param id the ID of the animal
      * @param command the new command to be added
      * @return true if the command was successfully added, false otherwise
      */
     boolean addNewCommand(int id, String command);

}
