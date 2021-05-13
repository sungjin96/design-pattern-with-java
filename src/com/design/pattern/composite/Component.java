package com.design.pattern.composite;

/**
 * Created by marathoner on 2021/05/13
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
