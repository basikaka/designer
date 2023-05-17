package V2_decorator;

public class Student extends Person{
    public Student(String name){
        this.name = name;
    }
    @Override
    public void study() {
        System.out.println(this.name + " 要开始学习了。");
    }
}
