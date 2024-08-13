package factorymethod_abstractfactory_singleton_2b;

class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}