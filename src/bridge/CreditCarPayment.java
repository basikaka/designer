package bridge;

public class CreditCarPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.printf("process pay with credit car.\n");
    }
}
