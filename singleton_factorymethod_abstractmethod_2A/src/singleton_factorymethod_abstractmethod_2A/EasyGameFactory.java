package singleton_factorymethod_abstractmethod_2A;

class EasyGameFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return (Weapon) new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthBoost();
    }
}