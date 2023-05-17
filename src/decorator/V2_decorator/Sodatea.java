package decorator.V2_decorator;

public class Sodatea implements YinLiao{
    @Override
    public double cost() {
        System.out.printf("苏打气泡饮料 30 元一杯\n");
        return 30;

    }
}
