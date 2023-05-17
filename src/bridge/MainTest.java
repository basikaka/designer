package bridge;

public class MainTest {
    public static void main(String[] args) {
        Payment weChat = new WeChatPayment();
        Book book1 = new Book(weChat);
        book1.purchase();
        // 用信用卡
        Book book2 = new Book(new CreditCarPayment());
        book2.purchase();
        // 使用现金
        Phone iphoneMax = new Phone(new CashPayment());
        iphoneMax.purchase();
    }
}
