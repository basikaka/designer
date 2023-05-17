package decorator;

interface Coffee {
    double cost();
}

class SimpleCoffee implements Coffee {
    public double cost() {
        return 2;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 0.5;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 0.25;
    }
}

class OolongteeDecorator extends CoffeeDecorator {
    public OolongteeDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 0.30;
    }

}

public class MainTest {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        Coffee coffeeWithOolongtee = new OolongteeDecorator(coffee);

        System.out.println("Coffee cost: " + coffee.cost());
        System.out.println("Coffee with Milk cost: " + coffeeWithMilk.cost());
        System.out.println("Coffee with Milk and Sugar cost: " + coffeeWithMilkAndSugar.cost());
        System.out.printf("Coffee with Oolongtea cost : %.2f\n", coffeeWithOolongtee.cost());
    }
}


