package Final.userinterface;

import java.util.List;

/**
 * This interface represents a view for displaying and interacting with data.
 *
 * @param <T> the type of data to be displayed
 */
public interface View<T> {

     /**
      * Retrieves the username.
      *
      * @return the username
      */
     String getUserName();

     /**
      * Retrieves the user birthdate.
      *
      * @return the user birthdate.
      */
     String getUserDate();

     /**
      * Prints all items in the collection.
      *
      * @param collection the collection of items to print
      * @param myClass the class type of the items in the collection
      */
     <V> void printAllAnimals(List<V> collection,Class<V> myClass);

     /**
      * Displays a message to the user.
      *
      * @param msg the message to display
      */
     void showMessage(String msg);
    
}
