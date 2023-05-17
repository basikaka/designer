package abstractfactory;

public class KN94Mask extends AbstractMask{

    public KN94Mask(){
        this.price = 1;
    }
    @Override
    public void protectMe() {

        System.out.println("KN94 价格是 " + this.price);
        System.out.println();
    }

}
