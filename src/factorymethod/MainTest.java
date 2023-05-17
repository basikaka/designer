package factorymethod;

public class MainTest {
    Car[] carStorage = new Car[10];
    public void importCars () {
        VanCarFactory vanCarFactory = new VanCarFactory();
        MiniCarFactory miniCarFactory = new MiniCarFactory();
        for (int i = 0; i < 5; i++) {
            this.carStorage[i] = vanCarFactory.makeCar();
            this.carStorage[i+5] = miniCarFactory.makeCar();
        }

    }

    public static void main(String[] args) {
        MainTest storage = new MainTest();
        storage.importCars();
    }
}
