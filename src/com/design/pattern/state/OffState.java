package com.design.pattern.state;

/**
 * Created by marathoner on 2021/05/25
 */
public class OffState implements LightState{
    @Override
    public void on() {
        System.out.println("Light ON");
    }

    @Override
    public void off() {
        System.out.println("Nothing");
    }
}
