package hogstate.state.account;

public class MemberState extends UserState{
    public MemberState(User user) {
        this.user = user;
    }

    @Override
    public void play4K() {
        System.out.println(this.user.getName() + "，你好，权限不足播放 4K 视频。请升级会员。");
    }

    @Override
    public void play1080P() {
        System.out.println(this.user.getName() + "，你好，正在播放 1080P 视频。");
    }

    @Override
    public void play720P() {
        System.out.println(this.user.getName() + "，你好，正在播放 720P 视频。");
    }
}
