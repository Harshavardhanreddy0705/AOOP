package info_debu_error_4b;

public class Client {
    public static void main(String[] args) {
        // Create the handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create the Logger and add commands
        Logger logger = new Logger();

        // Add commands for different log levels
        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));

        // Process the commands
        logger.processCommands();

        // Demonstrate logging for different levels
        System.out.println("\n--- Logging different levels ---\n");
        infoHandler.handleMessage("This is an information message", LogLevel.INFO);
        infoHandler.handleMessage("This is a debug message", LogLevel.DEBUG);
        infoHandler.handleMessage("This is an error message", LogLevel.ERROR);
    }
}
