package com.design.pattern.bridge;

/**
 * Created by marathoner on 2021/05/12
 */
public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot();

    }

    public void dash() {
        function.dash();

    }

    public void space() {
        function.space();

    }
}
