package abstractfactory;

public class MiniCarFactory extends CarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
