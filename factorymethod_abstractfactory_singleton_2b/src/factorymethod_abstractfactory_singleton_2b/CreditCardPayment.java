package factorymethod_abstractfactory_singleton_2b;

class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Credit Card!");
    }
}