package com.design.pattern.flyweight;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by marathoner on 2021/05/28
 */
public class FlyweightFactory {

    private Map<String, Flyweight> pool;

    public FlyweightFactory() {
        this.pool = new TreeMap<>();
    }

    public Flyweight getPool(String key) {
        Flyweight flyweight = pool.get(key);

        if (flyweight == null) {
            flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            System.out.println("생성" + key);
        } else {
            System.out.println("재사용 " + key);
        }
        return flyweight;
    }
}
