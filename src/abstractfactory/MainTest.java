package abstractfactory;

public class MainTest {
    public static void main(String[] args) {
        // 管理汽车生产
        AbstractFactory abstractFactory = new VanCarFactory();
        AbstractCar car = abstractFactory.newCar();
        car.run();

        abstractFactory = new MiniCarFactory();
        car = abstractFactory.newCar();
        car.run();

        // 用抽象工厂，管理口罩生产
        abstractFactory = new N95MaskFactory();
        AbstractMask mask = abstractFactory.newMask();
        mask.protectMe();

        abstractFactory = new KN94MaskFactory();
        mask = abstractFactory.newMask();
        mask.protectMe();

    }
}
