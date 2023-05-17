package composite;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Component> employees = new ArrayList<>();
        Component employee_1 = new Employee("John");
        Component employee_2 = new Employee("Baraba");
        Component employee_3 = new Designer("Ohamma");

        employees.add(employee_1);
        employees.add(employee_2);
        employees.add(employee_3);

        Department department = new Department("销售部", employees);
        Team team = new Team("广州大事业群", List.of(department));

//        for(Component component : employees) {
//            component.printName();
//        }

//        department.printName();

        team.printName();

    }
}
