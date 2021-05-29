package com.design.pattern.proxy;

/**
 * Created by marathoner on 2021/05/29
 */
public class Proxy implements Subject{

    private Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }

    @Override
    public void action1() {
        System.out.println("가벼운 작업 by Proxy");
    }

    @Override
    public void action2() {
        real.action2();
    }
}
