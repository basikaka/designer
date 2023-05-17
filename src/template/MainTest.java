package template;

public class MainTest {
    public static void main(String[] args) {
        Form zhangsan = new ZhangsanForm();
        Form lisi = new LisiForm();

        zhangsan.applicationForm();

        System.out.printf("=======\n");

        lisi.applicationForm();
    }
}

abstract class Form {

    public void applicationForm() {
        System.out.printf("申请学校：尼古拉斯大学\n");
        name();
        System.out.printf("申请学制：交换两年制\n");
        interest();
        school();
    }

    abstract void name();
    abstract void interest();
    abstract void school();
}

class ZhangsanForm extends Form {

    @Override
    void name() {
        System.out.printf("姓名：张三\n");
    }

    @Override
    void interest() {
        System.out.printf("兴趣：国际舞，计算机技术\n");
    }

    @Override
    void school() {
        System.out.printf("毕业于：哈尔滨工业大学\n");
    }
}

class LisiForm extends Form {

    @Override
    void name() {
        System.out.printf("姓名：李四\n");
    }

    @Override
    void interest() {
        System.out.printf("兴趣：小提琴，国际游泳健将，登山\n");
    }

    @Override
    void school() {
        System.out.printf("毕业于：韶关师范学院\n");
    }
}