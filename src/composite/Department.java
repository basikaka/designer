package composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Component{
    // 部门名
    String name;
    // 部门下一级架构
    List<Component> components;

    public Department(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    @Override
    public void printName() {
        System.out.printf("Department Name: %s\n", name);
        for (Component component : components){
            component.printName();
        }
    }
}
