package decorator.V2_decorator;

public class Fruittea implements YinLiao{
    @Override
    public double cost() {
        System.out.printf("水果茶 20 元一杯\n");
        return 20;
    }
}
