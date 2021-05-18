package com.design.pattern.chainOfResposibility.v2;

/**
 * Created by marathoner on 2021/05/18
 */
public class Attack {
    private int amount;

    public Attack(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
