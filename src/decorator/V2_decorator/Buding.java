package decorator.V2_decorator;

public class Buding extends Decorator{
    private double price = 5;

    @Override
    public double cost() {
        System.out.printf("布丁 5 元\n");
        return super.cost() + price;
    }
}
