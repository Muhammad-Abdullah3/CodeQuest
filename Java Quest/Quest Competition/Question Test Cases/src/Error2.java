interface PaymentGateway {
    void processPayment(double amount);
    void refundPayment(double amount);
}

class PayPalGateway implements PaymentGateway {
    public processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }

    public refundPayment(double amount) {
        System.out.println("Refunding $" + amount + " via PayPal.");
    }
}

class StripeGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }

    public void refundPayment(amount) {
        System.out.println("Refunding $" + amount + " via Stripe.");
    }
}

class PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processPayment(double amount) {
        gateway.processPayment(amount);
    }

    public void refundPayment(double amount) {
        gateway.refundPayment(amount);
    }
}

public class Error2 {
    public static void main(String[] args) {
        PaymentGateway paypalGateway = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PaymentProcessor(paypalGateway);
        paypalProcessor.processPayment(100.0);
        paypalProcessor.refundPayment(50.0);

        PaymentGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new PaymentProcessor(stripeGateway);
        stripeProcessor.processPayment(200.0);
        stripeProcessor.refundPayment(100.0);
    }
}
