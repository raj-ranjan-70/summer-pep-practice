interface payments {
    void pay();
}

interface Notifications {
    void send();
}

class StripePayments implements payments {
    
    @Override
    public void pay() {
        // Code to process payment using Stripe...
    }
}

class EmailNotifications implements Notifications {

    @Override
    public void send() {
        // Code to send email notification...
    }
}

class orderservice {
    
    private payments paymentMethod;
    private Notifications notificationMethod;

    public orderservice(payments paymentMethod, Notifications notificationMethod) {
        this.paymentMethod = paymentMethod;
        this.notificationMethod = notificationMethod;
    }

    public void processOrder() {
        paymentMethod.pay();
        notificationMethod.send();
    }
}