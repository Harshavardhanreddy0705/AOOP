package singleton_factorymethod_abstractmethod_2A;

class MediumEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new MediumEnemy();
    }
}