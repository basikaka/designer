package prototype;

public class MainTest {
    public static void main(String[] args) {
        TennisRacketPrototypeManager.buildProtypes();
        for (int i = 0; i < 2; i++) {
            TennisRacketPrototypeManager.getClonedRacket("pro staff");
            TennisRacketPrototypeManager.getClonedRacket("bf 113");
            TennisRacketPrototypeManager.getClonedRacket("graphene 360");
        }
    }
}
