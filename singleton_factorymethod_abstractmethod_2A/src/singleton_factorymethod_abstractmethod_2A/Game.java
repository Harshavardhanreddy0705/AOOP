package singleton_factorymethod_abstractmethod_2A;

public class Game {
    public static void main(String[] args) {
        // Initialize game state
        GameState gameState = GameState.getInstance();

        // Game factories based on difficulty
        GameFactory easyFactory = new EasyGameFactory();
        GameFactory hardFactory = new HardGameFactory();

        // Enemy factories based on difficulty
        EnemyFactory easyEnemyFactory = new EasyEnemyFactory();
        EnemyFactory hardEnemyFactory = new HardEnemyFactory();

        // Simulate game progression
        System.out.println("Level 1 (Easy):");
        playLevel(gameState, easyFactory, easyEnemyFactory);

        System.out.println("\nLevel 2 (Hard):");
        gameState.levelUp();
        playLevel(gameState, hardFactory, hardEnemyFactory);

        System.out.println("\nGame Over! Final Score: " + gameState.getScore());
    }

    public static void playLevel(GameState gameState, GameFactory factory, EnemyFactory enemyFactory) {
        // Create and use a weapon
        Weapon weapon = factory.createWeapon();
        weapon.use();

        // Create and activate a power-up
        PowerUp powerUp = factory.createPowerUp();
        powerUp.activate();

        // Create and attack with an enemy
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        // Update score
        gameState.addScore(100 * gameState.getCurrentLevel());
    }
}
