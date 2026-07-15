interface payment {
    void pay();
}

interface Notification {
    void send();
}

class StripePayment implements payment {
    
    @Override
    public void pay() {
        // Code to process payment using Stripe...
    }
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        // Code to send email notification...
    }
}

class orderservice {
    
    private payment paymentMethod;
    private Notification notificationMethod;

    public orderservice(payment paymentMethod, Notification notificationMethod) {
        this.paymentMethod = paymentMethod;
        this.notificationMethod = notificationMethod;
    }

    public void processOrder() {
        paymentMethod.pay();
        notificationMethod.send();
    }
}