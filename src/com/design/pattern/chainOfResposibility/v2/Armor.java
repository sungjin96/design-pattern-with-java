package com.design.pattern.chainOfResposibility.v2;

/**
 * Created by marathoner on 2021/05/18
 */
public class Armor implements Defense{

    private Defense nextDefense;
    private int def;

    public Armor(int def) {
        this.def = def;
    }

    public Armor() {
    }

    @Override
    public void defense(Attack attack) {
        process(attack);
        if (nextDefense != null) {
            nextDefense.defense(attack);
        }
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
