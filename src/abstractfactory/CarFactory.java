package abstractfactory;

public abstract  class CarFactory extends AbstractFactory{

    public abstract AbstractCar newCar();

    @Override
    public AbstractMask newMask() {
        return null;
    }
}
