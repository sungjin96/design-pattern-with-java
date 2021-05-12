package com.design.pattern.bridge;

/**
 * Created by marathoner on 2021/05/12
 */
public class PrintMorseCode extends MorseCode{
    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    public PrintMorseCode g(){
       dash();dash();dot();space();
       return this;
    }

    public PrintMorseCode a() {
       dot();dash();space();
        return this;
    }

    public PrintMorseCode r() {
       dot();dash();dot();space();
        return this;
    }

    public PrintMorseCode m() {
       dash();dash();space();
        return this;
    }
}
