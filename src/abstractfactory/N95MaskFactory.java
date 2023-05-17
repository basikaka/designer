package abstractfactory;

public class N95MaskFactory extends MaskFactory{
    @Override
    public AbstractMask newMask() {
        return new N95Mask();
    }
}
