package factorymethod_abstractfactory_singleton_2b;

class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}