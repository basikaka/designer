package factorymethod;

public class VanCar implements Car{
    @Override
    public Boolean startEngine() {
        System.out.println("VanCar engine is running.");
        return true;
    }

    @Override
    public void turnOffEngine() {
        System.out.println("VanCar turnoff.");
    }
}
