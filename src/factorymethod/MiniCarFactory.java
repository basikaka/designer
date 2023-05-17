package factorymethod;

public class MiniCarFactory implements CarFactory{
    private Car car;
    @Override
    public Car makeCar() {
        car = new MiniCar();
        if(car.startEngine() == true) {
             car.turnOffEngine();
             return car;
        }else {
            return null;
        }
    }
}
