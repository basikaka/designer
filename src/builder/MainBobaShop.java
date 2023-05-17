package builder;

public class MainBobaShop {
    public static void main(String[] args) {
        MilkteaDirector director = new MilkteaDirector(new SignatureMilkteaBuilder());
        System.out.println( director.makeMilktea());
        director.chageBuilder(new OolongMilkteaBuilder());
        director.makeMilktea();
        director.make("signature");
        director.make("oolong");

        CustomizeMilkteaBuilder builder = new CustomizeMilkteaBuilder();
        builder.reset();
        builder.addTopping("boba");
        builder.addTea("Oolong");
        builder.addSugerLevel(10);
        builder.getProduct();
    }
}
