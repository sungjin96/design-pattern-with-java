package com.design.pattern.builder.v1;

/**
 * Created by marathoner on 2021/05/10
 */
public abstract class Blueprint {

    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();

    public abstract Computer getComputer();
}
