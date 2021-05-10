package com.design.pattern.prototype;

/**
 * Created by marathoner on 2021/05/10
 */
public class Circle implements Cloneable {

    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x += 10;
        circle.y += 10;
        circle.r += 10;
        return circle;
    }
}
