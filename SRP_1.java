class Report {
    private DBOperations dbopr = new DBOperations()
    dbopr.fetchData();

    private Aggregator agg = new Aggregator()
    agg.calculateTotal();

    private Display dis = new Display()
    dis.renderHtml();

    private Emails email = new Emails()
    email.emailToBoss();
}

class DBOperations {
    void fetchData() { 
        // Code to fetch data from DB...
    }
}

class Aggregator {
    void calculateTotal() {
        // Code to calculate total...
    }
}

class Display {
    void renderHtml() {
        // Code to reder HTML to display
    }
}

class Emails {
    void emailToBoss() {
        // Code to send email to boss;
    }
}