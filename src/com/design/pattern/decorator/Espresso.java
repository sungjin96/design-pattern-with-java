package com.design.pattern.decorator;

/**
 * Created by marathoner on 2021/05/15
 */
public class Espresso extends AbstAdding{

    protected int espressoCount = 0;

    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+getAddPrice();
    }

    private int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;
        if (espressoCount > 1) {
            addPrice = 70;
        }
        return addPrice;
    }
}
