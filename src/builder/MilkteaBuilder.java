package builder;

public interface MilkteaBuilder {
    void reset();
    void addTopping();
    void addTea();
    void addSugerLevel();
    Milktea getProduct();
}
