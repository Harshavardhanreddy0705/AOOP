package singleton_factorymethod_abstractmethod_2A;

class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard Enemy attacks with high power!");
    }
}