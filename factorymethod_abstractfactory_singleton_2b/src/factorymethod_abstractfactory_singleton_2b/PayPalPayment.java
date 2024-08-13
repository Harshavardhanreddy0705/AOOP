package factorymethod_abstractfactory_singleton_2b;

class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Payment processed using PayPal!");
    }
}
