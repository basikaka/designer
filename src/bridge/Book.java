package bridge;

public class Book extends Product{

    public Book(Payment payment) {
        super(payment);
    }

    @Override
    public void purchase() {
        this.payment.processPayment();
    }
}
