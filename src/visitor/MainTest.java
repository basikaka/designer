package visitor;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Theater theater = new Theater();

        theater.add(new Wolf());
        theater.add(new GoodbyeMr());

        theater.accept(new Zhangsan());

        System.out.printf("==========\n");

        theater.accept(new Lisi());
    }
}

// visitor 观察者，这里举例为电影观众
interface Visitor {
    public void visitorWolf(Wolf movie);
    public void visitorGoodbyeMr(GoodbyeMr movie);
}

class Zhangsan implements Visitor {
    String name;
    public Zhangsan() {
        this.name = "张三";
    }

    public String getName() {
        return name;
    }

    @Override
    public void visitorWolf(Wolf movie) {
        System.out.printf(this.name + "观看了" + movie.getName() +",评分 9.1\n");
    }

    @Override
    public void visitorGoodbyeMr(GoodbyeMr movie) {
        System.out.printf(this.name + "观看了" + movie.getName() +",评分 8.1\n");
    }
}

class Lisi implements Visitor {
    String name;
    public Lisi(){
        this.name = "李四";
    }

    public String getName() {
        return name;
    }

    @Override
    public void visitorWolf(Wolf movie) {
        System.out.printf(this.name + "观看了" + movie.getName() +",评分 8.9\n");
    }

    @Override
    public void visitorGoodbyeMr(GoodbyeMr movie) {
        System.out.printf(this.name + "观看了" + movie.getName() +",评分 8.7\n");
    }
}
// 元素，举例为电影
interface Movie {
    public void accept(Visitor visitor);
}

class Theater {
    private List<Movie> movieList = new ArrayList<>();

    public void add(Movie movie) {
        this.movieList.add(movie);
    }

    public void remove() {
        this.movieList.remove(-1);
    }

    public void accept(Visitor visitor) {
        for (Movie movie : movieList) {
            movie.accept(visitor);
        }
    }

}

class Wolf implements Movie {
    String name;
    public Wolf(){
        this.name = "野狼传说";
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorWolf(this);
    }
}

class GoodbyeMr implements Movie {
    String name ;
    public GoodbyeMr() {
        this.name = "再见似是故人来";
    }

    public String getName() {
        return name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorGoodbyeMr(this);
    }
}
