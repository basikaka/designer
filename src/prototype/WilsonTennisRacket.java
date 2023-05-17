package prototype;

public class WilsonTennisRacket extends RacketPrototype{
    public WilsonTennisRacket(String brand, String model, double weight, double balancePoint){
        super(brand, model, weight, balancePoint);
    }
    @Override
    public RacketPrototype clone() {
        System.out.printf("Wilson Tennis Racket Clone: %s %s %s %s \n", this.brand, this.model, this.weight, this.balancePoint);
        return new WilsonTennisRacket(this.brand, this.model, this.weight, this.balancePoint);
    }
}
