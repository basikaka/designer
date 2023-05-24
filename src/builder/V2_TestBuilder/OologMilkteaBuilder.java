package builder.V2_TestBuilder;

public class OologMilkteaBuilder implements Builder{
    private Milktea oologMilktea;

    @Override
    public void reset() {
        this.oologMilktea = new OologMilktea();
    }

    @Override
    public void topping() {
        oologMilktea.setTopping("奶昔加盖");
    }

    @Override
    public void tea() {
        oologMilktea.setTea("乌龙茶");
    }

    @Override
    public void sugerLever() {
        oologMilktea.setSuger(40);
    }

    @Override
    public Milktea getProduct() {
        reset();
        topping();
        tea();
        sugerLever();
        return oologMilktea;
    }

}
