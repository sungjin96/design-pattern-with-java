package com.design.pattern.abstractFactory.v1.gt;

import com.design.pattern.abstractFactory.v1.abst.BikeFactory;
import com.design.pattern.abstractFactory.v1.abst.Body;
import com.design.pattern.abstractFactory.v1.abst.Wheel;

/**
 * Created by marathoner on 2021/05/11
 */
public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
