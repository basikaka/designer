package V2_decorator;

public class MathDecorator extends Decorator{
    public MathDecorator(Person person) {
        super(person);
    }

    @Override
    public void study(){
        super.study();
        System.out.printf("学习数学\n");
    }
}
