package hogstate.state.account;

public class Client {
    public static void main(String[] args) {
        User zhangsan = new User("尼古拉斯张三");

        zhangsan.play720P();
        zhangsan.play1080P();
        System.out.println("===注册普通会员===");
        zhangsan.joinMember();
        zhangsan.play1080P();
        zhangsan.play4K();
        System.out.println("===注册超级VIP===");
        zhangsan.joinVIP();
        zhangsan.play4K();

    }
}
