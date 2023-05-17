package hogiterator;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Aggregate xuexiao = new ConcreteAggregate();
        xuexiao.add("中大");
        xuexiao.add("华师");
        xuexiao.add("华工");
        xuexiao.add("北大");
        System.out.printf("聚合的内容有： \n");
        Iterator it = xuexiao.getIterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj.toString() );
        }

        Object obj = it.first();
        System.out.println("\nFirst： " + obj.toString());

    }
}


//抽象聚合：相当于把我自己要定义的数据存在聚合类型，聚合类型里用List来存储。这个聚合类型，实现了一些增删功能，并且能像系统内置的聚合类型一样，通过getIterator（）方法返回一个迭代器
interface Aggregate{
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}

//具体聚合
class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}

//抽象迭代器
interface Iterator {
    Object first();
    Object next();
    Boolean hasNext();
}

//具体迭代器：这个自定义的具体的迭代器，其实里面还是用了List聚合。当上面的ConreteAggraget聚合类型在需要返回迭代器时候，将一个list传过来了。
//在重写那些next，hasNext，first 这些方法的时候，就可以用 index 下标来返回了。
class ConcreteIterator implements Iterator{

    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }
    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if ( this.hasNext() ) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public Boolean hasNext() {
        if (index < list.size() - 1){
            return true;
        } else {
            return false;
        }
    }
}