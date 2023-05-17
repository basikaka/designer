package decorator.V2_decorator;

public class MainTest {
    public static void main(String[] args) {
        Milktea milktea = new Milktea();
        Buding buding1 = new Buding();
        Buding buding2 = new Buding();
        ZhenZhu zhenZhu = new ZhenZhu();

        buding1.setComponent(milktea);
        buding2.setComponent(buding1);
        zhenZhu.setComponent(buding2);

        System.out.println(zhenZhu.cost());
    }
}
