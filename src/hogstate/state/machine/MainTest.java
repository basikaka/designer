package hogstate.state.machine;

public class MainTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}

//售货机
class Context {
    private int cnt; // 售货机的库存
    private State state;

    public Context(){
        cnt = 2; // 初始库存
        this.state = new StateA(this);
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 购买
    public void request(){
        state.handle();
    }
}


//抽象状态
abstract class State {
    protected Context context;
    abstract void handle();
}

//有货状态
class StateA extends  State {

    public StateA(Context context) {
        this.context = context;
    }
    @Override
    void handle() {
        int cnt = context.getCnt();
        if (cnt > 0) {
            System.out.println("状态A: 购买成功。");
            context.setCnt( --cnt );
            if (cnt <= 0 ) {
                context.setState( new StateB( context ));
                System.out.println("库存不足，切换到状态B。");
            }

        }else {
            System.out.println("状态A：购买失败。");
        }
    }
}

class StateB extends State{
    public StateB (Context context) {
        this.context = context;
    }

    @Override
    void handle() {
        int cnt = context.getCnt();
        if (cnt <= 0 ) {
            System.out.println("状态B：库存不足，购买失败。");
            System.out.println("补货中......");
            context.setCnt( 5 );
            if (context.getCnt() > 0 ){
                context.setState( new StateA(context));
                System.out.println("补货成功，现在有货："+ context.getCnt());
            }
        }
    }
}