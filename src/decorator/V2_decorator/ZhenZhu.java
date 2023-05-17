package decorator.V2_decorator;

public class ZhenZhu extends Decorator{

    private double price = 7;

    @Override
    public double cost() {
        System.out.printf("珍珠 7 元\n");
        return super.cost() + price;
    }
}
