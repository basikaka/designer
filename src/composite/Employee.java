package composite;

public class Employee implements Component{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.printf("employee name: %s\n", this.name);
    }
}
