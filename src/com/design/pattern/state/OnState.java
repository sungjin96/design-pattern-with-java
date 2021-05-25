package com.design.pattern.state;

/**
 * Created by marathoner on 2021/05/25
 */
public class OnState implements LightState{
    @Override
    public void on() {
        System.out.println("Nothing");
    }

    @Override
    public void off() {
        System.out.println("Light OFF");
    }
}
