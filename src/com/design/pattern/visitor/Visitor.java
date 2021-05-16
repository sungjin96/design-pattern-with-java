package com.design.pattern.visitor;

/**
 * Created by marathoner on 2021/05/16
 */
public interface Visitor {
    public void visit(Visitable visitable);
    public int getAgeSum();
}
