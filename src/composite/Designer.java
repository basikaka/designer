package composite;

public class Designer implements Component{
    String name;

    public Designer(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.printf("Designer name: %s\n", this.name);
    }
}
