package factorymethod_abstractfactory_singleton_2b;

//UserAuthentication.java (Singleton)
class UserAuthentication {
 private static UserAuthentication instance;
 private String currentUser;

 private UserAuthentication() {
     // Private constructor to prevent instantiation
 }

 public static synchronized UserAuthentication getInstance() {
     if (instance == null) {
         instance = new UserAuthentication();
     }
     return instance;
 }

 public void login(String user) {
     this.currentUser = user;
     System.out.println(user + " has logged in.");
 }

 public String getCurrentUser() {
     return currentUser;
 }
}
