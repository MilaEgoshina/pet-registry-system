package src.exceptions;

/**
 * Custom Exception class for handling incorrect data input.
 * Extends RuntimeException for unchecked exceptions.
 */
public class UncorrectDataException extends RuntimeException{

    /**
     * Constructor for UncorrectDataException.
     *
     * @param msg the error message to be displayed
     */
    public UncorrectDataException (String msg) {
        super(msg);
    }

}
