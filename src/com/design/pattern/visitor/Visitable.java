package com.design.pattern.visitor;

/**
 * Created by marathoner on 2021/05/16
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
