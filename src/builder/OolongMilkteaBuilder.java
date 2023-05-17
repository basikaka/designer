package builder;

public class OolongMilkteaBuilder implements MilkteaBuilder{
    private OolongMilktea product;
    @Override
    public void reset() {
        this.product = new OolongMilktea();
    }

    @Override
    public void addTopping() {
        product.topping = "grass jelly";
    }

    @Override
    public void addTea() {
        product.tea = "oolong";
    }

    @Override
    public void addSugerLevel() {
        product.suger = 30;
    }

    @Override
    public Milktea getProduct() {
        return this.product;
    }
}
