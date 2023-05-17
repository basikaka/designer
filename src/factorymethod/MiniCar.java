package factorymethod;

public class MiniCar implements Car{
    @Override
    public Boolean startEngine() {
        System.out.println("MiniCar engine is running.");
        return true;
    }

    @Override
    public void turnOffEngine() {
        System.out.println("MiniCar turnoff.");
    }
}
