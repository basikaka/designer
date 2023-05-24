package prototype;

public class HeadTennisRacket extends RacketPrototype{

    public HeadTennisRacket(String brand, String model, double weight, double balancePoint){
        super(brand, model, weight, balancePoint);
    }
    @Override
    public RacketPrototype clone() {
        System.out.printf("Head Tennis Racket Clone:%s %s %s %s\n", this.brand, this.model, this.weight, this.balancePoint);
        return new HeadTennisRacket(this.brand, this.model, this.weight, this.balancePoint);
    }
}

