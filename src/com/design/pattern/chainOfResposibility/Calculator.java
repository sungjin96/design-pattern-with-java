package com.design.pattern.chainOfResposibility;

/**
 * Created by marathoner on 2021/05/17
 */
public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(Calculator nextCalculator){
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if(operator(request)) {
            return true;
        } else {
            if(nextCalculator != null)
            return nextCalculator.process(request);
        }
        return false;
    }

    protected abstract boolean operator(Request request);
}
