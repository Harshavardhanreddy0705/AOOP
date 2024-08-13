package factorymethod_abstractfactory_singleton_2b;

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}