package V2_decorator;

public class ChineseDecorator extends Decorator{
    public ChineseDecorator(Person person) {
        super(person);
    }

    @Override
    public void study(){
        super.study();
        System.out.printf("学习语文\n");
    }
}
