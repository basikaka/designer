package builder.V2_TestBuilder;

import builder.V2_TestBuilder.Builder;
import builder.V2_TestBuilder.OologMilkteaBuilder;
import builder.V2_TestBuilder.SignatureMilkteaBuilder;

public class Director {
    private Builder milkteaBuilder;

    public Milktea makeMilktea(){
        return milkteaBuilder.getProduct();
    }

    public Milktea make(String name) {
        if(name == "乌龙") {
            this.milkteaBuilder = new OologMilkteaBuilder();
        }
        if (name == "经典") {
            this.milkteaBuilder = new SignatureMilkteaBuilder();
        }
        return makeTea();
    }

    public Milktea makeTea(){
        return this.milkteaBuilder.getProduct();
    }

}
