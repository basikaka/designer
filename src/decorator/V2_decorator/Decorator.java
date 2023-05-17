package decorator.V2_decorator;

public abstract class Decorator implements YinLiao {
    private YinLiao yinliao;

    public void setComponent(YinLiao yinliao) {
        this.yinliao = yinliao;
    }

    @Override
    public double cost() {
        return this.yinliao.cost();
    }
}
