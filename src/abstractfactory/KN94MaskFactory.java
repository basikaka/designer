package abstractfactory;

public class KN94MaskFactory extends MaskFactory{
    @Override
    public AbstractMask newMask() {
        return new KN94Mask();
    }
}
