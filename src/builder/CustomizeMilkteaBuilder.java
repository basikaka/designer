package builder;

public class CustomizeMilkteaBuilder {

    private Milktea product;

    public void reset() {
        this.product = new Milktea();
    }
    public void addTopping(String boba) {
        product.topping = boba;
    }
    public void addTea(String tea){
        product.tea = tea;
    }
    public void addSugerLevel(Integer suger){
        product.suger = suger;
    }
    public Milktea getProduct(){
        System.out.format("Customized milktea: %s %s %s\n", this.product.topping, this.product.tea, this.product.suger);
        return this.product;
    }
}
