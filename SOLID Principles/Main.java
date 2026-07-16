//public class Main {
//    public static void main(String[] args) {
//
//        // MessageService msgService = new MessageService(new SMSMessage(), new SlackMessage());
//        // msgService.textNotify("user1", "Hello, this is a text message.");
//        // msgService.richTextNotify("user2", "Subject", "Hello, this is a rich text message.");
//
//        // AuthService authService1 = new AuthService(new AuthenticationUsingPassword());
//        // AuthService authService2 = new AuthService(new AuthenticationUsingToken());
//        // AuthService authService3 = new AuthService(new AuthenticationUsingLinks());
//
//        // authService1.executeAuth("raj@gmail.com", "Raj123");
//        // authService2.executeAuth("raj@gmail.com", "jkw5efk-kj8c-n84erw");
//        // authService3.executeAuth("raj@gmail.com", "https://raj.com?auth=raj-ranjan-70");
//
//        // DBOperations dbopr = new DBOperations();
//        // dbopr.fetchData();
//
//        // Aggregator agg = new Aggregator();
//        // agg.calculateTotal();
//
//        // Display dis = new Display();
//        // dis.renderHtml();
//
//        // Emails email = new Emails();
//        // email.emailToBoss();
//
//
//        // SmartBulb obj1 = new SmartBulb();
//        // ThermoStat obj2 = new ThermoStat();
//        // Speaker obj3 = new Speaker();
//
//        // obj1.turnOn();
//        // obj1.turnOff();
//        // obj1.setBrightness();
//
//        // obj2.turnOn();
//        // obj2.turnOff();
//        // obj2.setTemperature();
//
//        // obj3.turnOn();
//        // obj3.turnOff();
//        // obj3.play();
//
////        BookService obj = new BookService(new BookOperationExec(), new FlatLateFeeCalculation(), new InMemoryDataPersistence(), new EmailNotification());
////
////        obj.bookService();
//
//        Payment paypal = new PaypalPayment();
//        FraudCheck fraud = new AsiaFraudCheck();
//
//        PaymentService service =
//                new PaymentService(paypal, fraud);
//
//        service.processPayment(500, "PASS");
//
//        RefundService refundService = new RefundService();
//        refundService.refund((Refundable) paypal, 200);
//
//        CaptureService captureService = new CaptureService();
//        captureService.capture((PartialCapture) paypal, 100);
//
//        RetryService retryService = new RetryService();
//        retryService.retry((Idempotent) paypal, true);
//    }
//}
