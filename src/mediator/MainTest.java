package mediator;

public class MainTest {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague("张三", mediator);
        Colleague colleague2 = new ConcreteColleague("王五", mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessage("软考复习");
        colleague2.sendMessage("祝你顺利通过");

    }
}

// 抽象中介接口
abstract class Mediator {
    public abstract void sendMessage(String message, Colleague colleague);
}
// 具体中介者
class ConcreteMediator extends Mediator {
    // 中介者，维护它的所有的对象
    public Colleague colleague1;
    public Colleague colleague2;

    public void setColleague1(Colleague colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(Colleague colleague) {
        this.colleague2 = colleague;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        if ( colleague == colleague1 ) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}

// 抽象同事类
abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public abstract void sendMessage(String message);
    public abstract void getMessage(String message);

}

// 具体同事类
class ConcreteColleague extends Colleague {

    public ConcreteColleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        // 通知中介者 mediator,谁要发送消息了，由于例子只有两个同事，所以
        mediator.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.printf(name  + ",收到消息： " + message + "\n");
    }
}

