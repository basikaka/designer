package bridge;

public abstract class Product{
    protected Payment payment;
    public Product(Payment payment) {
        this.payment = payment;
    }

    public abstract void purchase();
}
