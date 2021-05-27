package com.design.pattern.memento.abc;

/**
 * Created by marathoner on 2021/05/27
 */
public class Memento {
    String state;

    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return this.state;
    }
}
