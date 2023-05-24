package builder.V2_TestBuilder;

import builder.SignatureMilktea;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        OologMilktea oologMilktea = (OologMilktea) director.make("乌龙");

        System.out.println("乌龙茶价格： " + oologMilktea.getPrice());
    }
}
