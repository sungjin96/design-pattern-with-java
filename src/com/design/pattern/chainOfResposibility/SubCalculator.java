package com.design.pattern.chainOfResposibility;

/**
 * Created by marathoner on 2021/05/17
 */
public class SubCalculator extends Calculator {
    @Override
    protected boolean operator(Request request) {
        if(request.getOperator().equals("-")) {
            int a = request.getA();
            int b = request.getB();

            System.out.println(a + " - " + b + " = "+ (a-b));
        }
        return false;
    }
}
