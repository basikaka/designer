package adapter;

public class Adapter extends USB{

    private TypeC typec = new TypeC();

    @Override
    public void charge(){
        typec.charge();
    }
}
