package singleton_factorymethod_abstractmethod_2A;

//Singleton pattern: GameState class
class GameState {
 private static GameState instance;
 private int currentLevel;
 private int score;

 private GameState() {
     currentLevel = 1;
     score = 0;
 }

 public static GameState getInstance() {
     if (instance == null) {
         instance = new GameState();
     }
     return instance;
 }

 public int getCurrentLevel() {
     return currentLevel;
 }

 public void levelUp() {
     currentLevel++;
 }

 public int getScore() {
     return score;
 }

 public void addScore(int points) {
     score += points;
 }

 public void reset() {
     currentLevel = 1;
     score = 0;
 }
}
