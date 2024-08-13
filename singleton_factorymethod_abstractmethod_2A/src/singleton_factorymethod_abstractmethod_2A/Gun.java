package singleton_factorymethod_abstractmethod_2A;

class Gun implements Weapon {
    @Override
    public void use() {
        System.out.println("Shooting a gun!");
    }
}