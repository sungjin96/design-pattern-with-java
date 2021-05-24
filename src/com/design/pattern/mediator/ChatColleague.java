package com.design.pattern.mediator;

import com.design.pattern.mediator.contract.Colleague;

/**
 * Created by marathoner on 2021/05/24
 */
public class ChatColleague extends Colleague {
    @Override
    public void handle(String data) {
        System.out.println(this + data);
    }
}
