package com.design.pattern.proxy;

/**
 * Created by marathoner on 2021/05/29
 */
public class RealSubject implements Subject {
    @Override
    public void action1() {
        System.out.println("가벼운 작업 by 실제");
    }

    @Override
    public void action2() {
        System.out.println("무거운 작업");
    }
}
