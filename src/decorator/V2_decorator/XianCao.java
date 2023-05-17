package decorator.V2_decorator;

public class XianCao extends Decorator{

    private double price = 6;

    @Override
    public double cost(){
        System.out.printf("仙草 6 元\n");
        return super.cost() + price;
    }
}
