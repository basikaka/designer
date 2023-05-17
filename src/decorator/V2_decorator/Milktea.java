package decorator.V2_decorator;

public class Milktea implements YinLiao{
    @Override
    public double cost() {
        System.out.printf("奶茶 10 元一杯\n");
        return 10;
    }
}
