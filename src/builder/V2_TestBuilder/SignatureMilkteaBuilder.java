package builder.V2_TestBuilder;

import builder.SignatureMilktea;

public class SignatureMilkteaBuilder implements Builder{

    private Milktea signatureMilktea;

    @Override
    public void reset() {
        this.signatureMilktea = new SingnatureMilktea();
    }

    @Override
    public void topping() {
       signatureMilktea.setTopping("超经典珍珠");
    }

    @Override
    public void tea() {
        signatureMilktea.setTea("高山红茶");
    }

    @Override
    public void sugerLever() {
        signatureMilktea.setSuger(50);
    }

    @Override
    public Milktea getProduct() {
        reset();
        topping();
        tea();
        sugerLever();
        return signatureMilktea;
    }
}
