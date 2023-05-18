package hogstate.state.account;

public class User {
    private String name;
    private UserState userState;

    public User(String username) {
        this.name = username;
        this.userState = new RegisterState(this);
    }

    public void joinMember(){
        this.userState = new MemberState(this);
    }

    public void joinVIP(){
        this.userState = new VIPState(this);
    }

    public String getName(){
        return name;
    }

    public void play4K(){
        this.userState.play4K();
    }

    public void play1080P(){
        this.userState.play1080P();
    }

    public void play720P(){
        this.userState.play720P();
    }
}
