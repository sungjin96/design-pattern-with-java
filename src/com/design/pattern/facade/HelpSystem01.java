package com.design.pattern.facade;

/**
 * Created by marathoner on 2021/05/20
 */
class HelpSystem01 {
    public HelpSystem01() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }


    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
