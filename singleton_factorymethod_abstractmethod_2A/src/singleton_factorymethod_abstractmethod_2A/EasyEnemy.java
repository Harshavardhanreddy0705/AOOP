package singleton_factorymethod_abstractmethod_2A;

class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy Enemy attacks with low power!");
    }
}