interface Payment {
    void pay(int amount);
}

interface Refundable {
    void refund(int amount);
}

interface PartialCapture {
    void capture(int amount);
}

interface Idempotent {
    void retry(boolean isIdempotent);
}

interface FraudCheck {
    boolean check(String data);
}

class StripePayment implements Payment, Refundable {

    @Override
    public void pay(int amount) {
        System.out.println("Stripe payment: " + amount);
    }

    @Override
    public void refund(int amount) {
        System.out.println("Stripe refund: " + amount);
    }
}

class PaypalPayment implements Payment, Refundable, PartialCapture, Idempotent {

    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment: " + amount);
    }

    @Override
    public void refund(int amount) {
        System.out.println("Paypal refund: " + amount);
    }

    @Override
    public void capture(int amount) {
        System.out.println("Paypal capture: " + amount);
    }

    @Override
    public void retry(boolean idempotent) {

        if(idempotent)
            System.out.println("Retry Paypal");
        else
            System.out.println("Cannot retry");
    }
}

class InHouseCredit implements Payment, Refundable, PartialCapture, Idempotent {

    @Override
    public void pay(int amount) {
        System.out.println("In House Credit payment: " + amount);
    }

    @Override
    public void refund(int amount) {
        System.out.println("In House Credit refund: " + amount);
    }

    @Override
    public void capture(int amount) {
        System.out.println("In House Credit capture: " + amount);
    }

    @Override
    public void retry(boolean idempotent) {

        if(idempotent)
            System.out.println("Retry In House Credit");
        else
            System.out.println("Cannot retry");
    }
}


class EUFraudCheck implements FraudCheck {

    @Override
    public boolean check(String data) {
        return data.equals("PASS");
    }
}

class AsiaFraudCheck implements FraudCheck {

    @Override
    public boolean check(String data) {
        return data.equals("PASS");
    }
}

class PaymentService {

    Payment payment;
    FraudCheck fraudCheck;

    PaymentService(Payment payment, FraudCheck fraudCheck) {

        this.payment = payment;
        this.fraudCheck = fraudCheck;
    }

    public void processPayment(int amount, String fraudData) {

        if(!fraudCheck.check(fraudData)) {
            System.out.println("Fraud detected.");
            return;
        }

        payment.pay(amount);
    }
}

class RetryService {

    public void retry(Idempotent paymentType, boolean isIdempotent) {

        paymentType.retry(isIdempotent);
    }
}

class RefundService {

    public void refund(Refundable paymentType, int amount) {

        paymentType.refund(amount);
    }
}

class CaptureService {

    public void capture(PartialCapture paymentType, int amount) {

        paymentType.capture(amount);
    }
}

class Main {

    public static void main(String[] args) {

        Payment paypal = new PaypalPayment();
        Payment inHouseCredit = new InHouseCredit();
        FraudCheck fraud = new AsiaFraudCheck();

        PaymentService service = new PaymentService(paypal, fraud);

        service.processPayment(500, "PASS");

        RefundService refundService = new RefundService();
        refundService.refund((Refundable) paypal, 200);

        CaptureService captureService = new CaptureService();
        captureService.capture((PartialCapture) paypal, 100);
        captureService.capture((PartialCapture) inHouseCredit, 200);

        RetryService retryService = new RetryService();
        retryService.retry((Idempotent) paypal, false);
    }
}