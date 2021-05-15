package com.design.pattern.decorator;

/**
 * Created by marathoner on 2021/05/15
 */
abstract public class AbstAdding implements IBeverage{
    private final IBeverage base;

    public AbstAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}
