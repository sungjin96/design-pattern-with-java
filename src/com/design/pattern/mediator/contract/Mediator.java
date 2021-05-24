package com.design.pattern.mediator.contract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marathoner on 2021/05/24
 */
public abstract class Mediator {

    protected List<Colleague> colleagues;

    public Mediator() {
        colleagues = new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague) {
        if (colleague == null) return false;
        return colleagues.add(colleague);
    }

    public abstract void mediate(String data);

}
