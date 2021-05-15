package com.design.pattern.decorator;

/**
 * Created by marathoner on 2021/05/15
 */
public class Milk extends AbstAdding{
    public Milk(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }
}
