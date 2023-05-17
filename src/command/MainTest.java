package command;

public class MainTest {
    public static void main(String[] args) {
        TV tvs2 = new TV();
        Command on_command = new OnCommand(tvs2);
        Command off_command = new TurnOffCommand(tvs2);
        Invoker invoker = new Invoker(on_command);
        invoker.call();
        invoker.setCommand(off_command);
        invoker.call();

    }
}
