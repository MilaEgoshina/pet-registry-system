package src.interfaces;

/**
 * Interface, which allow to realise learning new commands for concrete animal.
 */
public interface LearnNewCommand {

    /**
     * Method, which realise a learning new command for concrete animal.
     *
     * @param newCommand the new command to be learned
     * @return true if the command was successfully learned, false otherwise
     */
     boolean learnNewCommand(String newCommand);
}
