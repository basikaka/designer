package hogstate.state.account;

public class RegisterState extends UserState{
    public RegisterState(User user){
        this.user = user;
    }
    @Override
    public void play4K() {
        System.out.println(this.user.getName() +  "，你的等级权限不足，不能播放 4K 视频，请升级后再试。");
    }

    @Override
    public void play1080P() {
        System.out.println( this.user.getName()+"，你的等级权限不足，不能播放 1080P 视频，请升级后再试。");
    }

    @Override
    public void play720P() {
        System.out.println(this.user.getName()+ ",你好，正在播放 720P 视频。");
    }
}
