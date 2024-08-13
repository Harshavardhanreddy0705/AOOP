package bankingprocess_1b;

//UserSession.java (Singleton)
public class UserSession {
 // The single instance of the UserSession class
 private static UserSession instance;
 private boolean loggedIn;
 private String username;

 // Private constructor to prevent instantiation
 private UserSession() {
     this.loggedIn = false;
 }

 // Method to provide access to the single instance
 public static synchronized UserSession getInstance() {
     if (instance == null) {
         instance = new UserSession();
     }
     return instance;
 }

 // Method to log in the user
 public void login(String username) {
     if (!loggedIn) {
         this.username = username;
         this.loggedIn = true;
         System.out.println(username + " has logged in.");
     } else {
         System.out.println("User is already logged in.");
     }
 }

 // Method to log out the user
 public void logout() {
     if (loggedIn) {
         System.out.println(username + " has logged out.");
         this.loggedIn = false;
         this.username = null;
     } else {
         System.out.println("No user is currently logged in.");
     }
 }

 // Method to check if the user is logged in
 public boolean isLoggedIn() {
     return loggedIn;
 }

 public String getUsername() {
     return username;
 }
}
