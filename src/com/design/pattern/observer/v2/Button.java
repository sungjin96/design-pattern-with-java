package com.design.pattern.observer.v2;

import java.util.Observable;

/**
 * Created by marathoner on 2021/05/21
 */
public class Button extends Observable {

    public void onClick() {
        setChanged();
        notifyObservers();
    }
}
