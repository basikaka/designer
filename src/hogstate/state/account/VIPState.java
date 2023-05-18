package hogstate.state.account;

public class VIPState extends UserState{
    public VIPState(User user) {
        this.user = user;
    }
    @Override
    public void play4K() {
        System.out.println(this.user.getName() + ",你好，你是超级VIP会员，正在播放 4K 视频。");
    }

    @Override
    public void play1080P() {
        System.out.println(this.user.getName() + ",你好，你是超级VIP会员，正在播放 1080P 视频。");

    }

    @Override
    public void play720P() {
        System.out.println(this.user.getName() + ",你好，你是超级VIP会员，正在播放 720P 视频。");

    }
}
