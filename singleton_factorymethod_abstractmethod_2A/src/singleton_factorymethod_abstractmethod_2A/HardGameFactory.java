package singleton_factorymethod_abstractmethod_2A;
class HardGameFactory implements GameFactory {
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }

    @Override
    public PowerUp createPowerUp() {
        return new Shield();
    }
}