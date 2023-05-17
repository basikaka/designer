package bridge;

public class WeChatPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.printf("process payment with WeChat.\n");
    }
}
