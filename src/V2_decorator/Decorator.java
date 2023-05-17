package V2_decorator;

import composite.Component;

public abstract class Decorator extends Person {
    protected Person person;
    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void study(){
        this.person.study();
    }


}
