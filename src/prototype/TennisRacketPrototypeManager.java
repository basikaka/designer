package prototype;

import java.util.Hashtable;

/*
* 原型管理器：已经将球拍的原型放到一个hasH表里了，以后，想要哪个型号，就给型号，马上给你复制一个对象。当有
* 新的型号，只需创建一个原型，并把该型号的球拍原型放到hash表里，当你想要用新的球拍型号，也能复制一份给你。
* */
class TennisRacketPrototypeManager {

    private static Hashtable<String, RacketPrototype> racketMap = new Hashtable<String, RacketPrototype>();

    public static RacketPrototype getClonedRacket(String model) {
        RacketPrototype r = racketMap.get(model);
        return (RacketPrototype) r.clone();
    }

    public static void buildProtypes() {
        WilsonTennisRacket r1 = new WilsonTennisRacket("Wilson", "Pro Staff", 320.0, 32.5);
        racketMap.put("pro staff", r1);
        HeadTennisRacket h1 = new HeadTennisRacket("Head", "Graphene 360 Speed", 320.0, 32.5);
        racketMap.put("graphene 360" , h1);
        BabolatTennisRacket b1 = new BabolatTennisRacket("Babolat", "BF 113", 318, 32.4);
        racketMap.put("bf 113", b1);
    }
}
