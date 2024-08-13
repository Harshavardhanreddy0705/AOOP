package singletonpattern_1a;

//Logger.java (Singleton)
public class Logger {
 // The single instance of the Logger class
 private static Logger instance;
 
 // Private constructor to prevent instantiation
 private Logger() {}

 // Method to provide access to the single instance
 public static synchronized Logger getInstance() {
     if (instance == null) {
         instance = new Logger();
     }
     return instance;
 }

 // Method to log messages
 public void log(String message) {
     System.out.println("Log entry: " + message);
 }
}
