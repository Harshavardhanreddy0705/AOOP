package singleton_factorymethod_abstractmethod_2A;

class HealthBoost implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Boosting health!");
    }
}
