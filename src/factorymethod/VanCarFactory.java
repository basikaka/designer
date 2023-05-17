package factorymethod;

public class VanCarFactory implements CarFactory{
    private Car car;
    @Override
    public Car makeCar() {
        this.car = new VanCar();
        if( this.car.startEngine() == true) {
            this.car.turnOffEngine();
            return car;
        }else {
            return null;
        }
    }
}
