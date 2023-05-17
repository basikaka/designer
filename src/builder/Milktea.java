package builder;

public class Milktea {
    double price;
    String topping = "boba";
    String tea = "regular Milk tea";
    Integer suger = 100;

    public Milktea() {
        this.price = 7.0;
    }

    public double getPrice(){
        return this.price;
    }
}
