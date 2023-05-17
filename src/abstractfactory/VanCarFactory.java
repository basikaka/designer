package abstractfactory;

public class VanCarFactory extends CarFactory{
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
