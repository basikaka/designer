package builder.V2_TestBuilder;

// 原味奶茶
public class Milktea {
    protected double price;
    protected String topping = "波波";
    protected int suger = 75;
    protected String tea = "红茶";

    public Milktea() {
        this.price = 7.0; // 原味奶茶，固定价格
    }

    public double getPrice(){
        return this.price;
    }

    public String getTopping() {
        return topping;
    }

    public int getSuger() {
        return suger;
    }

    public String getTea() {
        return tea;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSuger(int suger) {
        this.suger = suger;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }
}
