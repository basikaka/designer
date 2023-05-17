package bridge;

public class CashPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.printf("process payment with Cash.\n");
    }
}
