/*
    From scratch: members borrow and return books; the system checks availability, applies late fees,
    notifies members, and persists everything. constrainsts: swap the storage (in-memory => SQL) without touching
    business rules; add an SMS notifier without editing borrow flow; late-fee calculation must be swappable (flat vs tiered);
    every rule independently testable.
*/

interface BookOperations {
    void borrowBooks();
    void returnBooks();
}

interface LateFeeCalculation {
    void calculateLateFee();
}

interface DataPersistence {
    void dataStorage();
}

interface Notification {
    void sendNotification();
}

class BookOperationExec implements BookOperations {

    @Override
    public void borrowBooks() {
        System.out.println("Borrowing the Books...");
    }

    @Override
    public void returnBooks() {
        System.out.println("Returning the Books...");
    }
}

class FlatLateFeeCalculation implements LateFeeCalculation {

    @Override
    public void calculateLateFee() {
        System.out.println("Late Fee Calculation via Flat Rate...");
    }
}

class TieredLateFeeCalculation implements LateFeeCalculation {

    @Override
    public void calculateLateFee() {
        System.out.println("Late Fee Calculation via Tiered Rate...");
    }
}


class InMemoryDataPersistence implements DataPersistence {

    @Override
    public void dataStorage() {
        System.out.println("Data Persitance via In-Memory...");
    }
}

class SQLDataPersistence implements DataPersistence {

    @Override
    public void dataStorage() {
        System.out.println("Data Persitance via SQL DB...");
    }
}

class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending Notification via Email...");
    }
}

class SMSNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending Notification via SMS...");
    }
}

class BookService {
    BookOperations bookOpr;
    LateFeeCalculation lateFeeCalc;
    DataPersistence dataPersistence;
    Notification notification;

    BookService(BookOperations bookOpr, LateFeeCalculation lateFeeCalc, DataPersistence dataPersistence, Notification notification) {
        this.bookOpr = bookOpr;
        this.lateFeeCalc = lateFeeCalc;
        this.dataPersistence = dataPersistence;
        this.notification = notification;
    }

    void bookService() {
        bookOpr.borrowBooks();
        lateFeeCalc.calculateLateFee();
        dataPersistence.dataStorage();
        notification.sendNotification();
        bookOpr.returnBooks();
    }
}