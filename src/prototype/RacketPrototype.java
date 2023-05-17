package prototype;

public abstract class RacketPrototype {
    protected String brand;
    protected String model;
    protected double weight;
    protected double balancePoint;

    public RacketPrototype(String brand, String model, double weight, double balancePoint) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.balancePoint = balancePoint;
    }

    public abstract RacketPrototype clone();
}
