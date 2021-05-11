package com.design.pattern.abstractFactory.v1.sam;

import com.design.pattern.abstractFactory.v1.abst.BikeFactory;
import com.design.pattern.abstractFactory.v1.abst.Body;
import com.design.pattern.abstractFactory.v1.abst.Wheel;

/**
 * Created by marathoner on 2021/05/11
 */
public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
