package abstractfactory;

public class N95Mask extends AbstractMask{
    public N95Mask(){
        this.price = 12;
    }
    @Override
    public void protectMe() {
        System.out.println("N95 Mask 价格是 " + this.price);
        System.out.println();
    }
}
