package factorymethod_abstractfactory_singleton_2b;

public class RideSharingApp {
    public static void main(String[] args) {
        // Singleton: User Authentication
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.login("JohnDoe");

        // Factory Method: Vehicle Creation
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.book();

        vehicleFactory = new BikeFactory();
        vehicle = vehicleFactory.createVehicle();
        vehicle.book();

        // Abstract Factory: Payment Method
        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment();

        paymentFactory = new PayPalFactory();
        paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment();
    }
}
