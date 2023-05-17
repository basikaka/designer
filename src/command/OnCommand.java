package command;

public class OnCommand implements Command{
    private TV tv; // 命令的接收者
    public OnCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.OnTv();
    }
}
