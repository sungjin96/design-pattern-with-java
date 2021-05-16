package com.design.pattern.visitor;

/**
 * Created by marathoner on 2021/05/16
 */
public class VisitableA implements Visitable{

    private int age;

    public VisitableA(int age) {
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
