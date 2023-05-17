package bridge;

public class Phone extends Product{
    public Phone(Payment payment){
        super(payment);
    }
    @Override
    public void purchase() {
        this.payment.processPayment();
    }
}
