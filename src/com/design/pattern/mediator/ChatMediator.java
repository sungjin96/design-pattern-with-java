package com.design.pattern.mediator;

import com.design.pattern.mediator.contract.Colleague;
import com.design.pattern.mediator.contract.Mediator;

/**
 * Created by marathoner on 2021/05/24
 */
public class ChatMediator extends Mediator {
    @Override
    public void mediate(String data) {
        for (Colleague co : colleagues) {
            co.handle(data);
        }
    }
}
