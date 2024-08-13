package factorymethod_abstractfactory_singleton_2b;

class ScooterFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }
}