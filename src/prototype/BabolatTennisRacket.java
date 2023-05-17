package prototype;

public class BabolatTennisRacket extends RacketPrototype{
    public BabolatTennisRacket(String brand, String model, double weight, double balancePoint){
        super(brand, model, weight, balancePoint);
    }
    @Override
    public RacketPrototype clone() {
        System.out.printf("Babolat Tennis Racket Clone: %s %s %s %s\n", this.brand, this.weight, this.weight, this.balancePoint);
        return new BabolatTennisRacket(this.brand, this.model, this.weight, this.balancePoint);
    }
}
