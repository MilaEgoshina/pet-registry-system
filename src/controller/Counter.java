package src.controller;

/**
 * Counter class that implements AutoCloseable interface.
 * This class is used to count the number of times a method is called.
 */
public class Counter implements AutoCloseable{

    /**
     * Static variable to store the count of method calls
     */
    public static int count;

    /**
     * Default constructor that initializes the count to 0
     */
    {
        count = 0;
    }
    /**
     * Method to increment the count by 1
     */
    public void add(){
        count++;
    }

    /**
     * Overridden method from AutoCloseable interface.
     * This method is called when the Counter object is closed.
     * It prints a message to indicate that Counter is closed.
     *
     * @throws Exception if an error occurs while closing the Counter
     */
    @Override
    public void close() throws Exception {
        
        System.out.println("Counter closed");
    }
    
}
