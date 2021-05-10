package com.design.pattern.prototype;

/**
 * Created by marathoner on 2021/05/10
 */
public class Shape implements Cloneable{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
