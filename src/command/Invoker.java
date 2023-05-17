package command;

public class Invoker { // 相当于一个遥控器，可以集成很多命令，如果足够多，则可以用数组等保存所有的命令，然后统一在这控制
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }


}
