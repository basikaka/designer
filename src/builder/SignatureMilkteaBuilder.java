package builder;

public class SignatureMilkteaBuilder implements MilkteaBuilder{
    private SignatureMilktea product;
    @Override
    public void reset() {
        this.product = new SignatureMilktea();
    }

    @Override
    public void addTopping() {
        product.topping = "boba";
    }

    @Override
    public void addTea() {
        product.tea = "signature tea";
    }

    @Override
    public void addSugerLevel() {
        product.suger = 50;
    }

    @Override
    public Milktea getProduct() {
        return this.product;
    }
}
