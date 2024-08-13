package singletonpattern_1a;
public class LoggingApp {
    public static void main(String[] args) {
        // Get the single instance of the Logger
        Logger logger = Logger.getInstance();

        // Log messages
        logger.log("Application started");
        logger.log("Processing data...");
        logger.log("Application finished");

        // Simulate logging from different parts of the application
        AnotherClass.doSomething();
    }
}

// AnotherClass.java (Another part of the application)
class AnotherClass {
    public static void doSomething() {
        // Get the single instance of the Logger
        Logger logger = Logger.getInstance();
        logger.log("AnotherClass is doing something");
    }
}
