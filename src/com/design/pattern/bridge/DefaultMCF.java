package com.design.pattern.bridge;

/**
 * Created by marathoner on 2021/05/12
 */
public class DefaultMCF implements MorseCodeFunction{
    @Override
    public void dot() {
        System.out.print("·");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
