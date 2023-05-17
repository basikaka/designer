package V2_decorator;

public class MainTest {
    public static void main(String[] args) {
        Person student = new Student("Tom");

        student = new MathDecorator(student);
        student = new ChineseDecorator(student);
        student.study();
    }
}
