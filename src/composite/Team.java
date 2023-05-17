package composite;

import java.util.List;

public class Team implements Component{
    String name;
    List<Component> components;

    public Team(String name, List<Component> components){
        this.name = name ;
        this.components = components;
    }
    @Override
    public void printName() {
        System.out.printf("Team Name: %s\n", this.name);
        for(Component component: this.components) {
            component.printName();
        }
    }
}
