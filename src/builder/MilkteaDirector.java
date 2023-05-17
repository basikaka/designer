package builder;

public class MilkteaDirector {
    private MilkteaBuilder milkteaBuilder;

    public MilkteaDirector(MilkteaBuilder builder){
        this.milkteaBuilder = builder;
    }

    public void chageBuilder(MilkteaBuilder builder) {
        this.milkteaBuilder = builder;
    }

    public Milktea makeMilktea(){
        this.milkteaBuilder.reset();
        this.milkteaBuilder.addTopping();
        this.milkteaBuilder.addTea();
        this.milkteaBuilder.addSugerLevel();
        return this.milkteaBuilder.getProduct();
    }

    public Milktea make(String type){
        if (type == "signature") {
            this.chageBuilder(new SignatureMilkteaBuilder());
        } else if (type == "oolong") {
            this.chageBuilder(new OolongMilkteaBuilder());

        }
        return this.makeMilktea();
    }
}
