package memento;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("状态1");
        Memento memento1 = originator.createMemento();
        caretaker.addMemento(memento1);
        originator.setState("状态2");
        Memento memento2 = originator.createMemento();
        caretaker.addMemento(memento2);
        //caretaker.showMemento();

        System.out.println("originator 当前的状态是：" + originator.getState());
        System.out.println("=====恢复到状态1========");
        originator.setMemento( caretaker.getMemento(0) );
        System.out.println("originator 当前的状态是：" + originator.getState()) ;

    }
}

// 原发器
class Originator {
    private String state;

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}

// 备忘录
class Memento{
    private String state;

    public String getState(){
        return this.state;
    }

    public Memento(String state){
        this.state = state;
    }
}

// 管理者
class Caretaker {
    private int index = -1;
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        } else {
            return  null;
        }
    }

    public void showMemento(){
        for(Memento memento:mementoList){
            System.out.printf(memento.getState().toString() + "\n");
        }
    }
}