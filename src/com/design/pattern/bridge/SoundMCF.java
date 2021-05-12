package com.design.pattern.bridge;

/**
 * Created by marathoner on 2021/05/12
 */
public class SoundMCF implements MorseCodeFunction{
    @Override
    public void dot() {
        System.out.print("삑");
    }

    @Override
    public void dash() {
        System.out.print("삐~");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
