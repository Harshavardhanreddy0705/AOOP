package factorymethod_abstractfactory_singleton_2b;

class CreditCardFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}