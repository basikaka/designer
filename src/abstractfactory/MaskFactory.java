package abstractfactory;

public abstract class MaskFactory extends AbstractFactory{
    @Override
    public AbstractCar newCar() {
        return null;
    }

    @Override
    public abstract AbstractMask newMask();
}
