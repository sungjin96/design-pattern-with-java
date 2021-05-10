package com.design.pattern;

import com.design.pattern.builder.v1.Computer;
import com.design.pattern.builder.v1.Blueprint;
import com.design.pattern.builder.v1.ComputerFactory;
import com.design.pattern.builder.v1.LgGramBlueprint;

/**
 * Created by marathoner on 2021/05/10
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Circle circle1 = new Circle(1,2,3);
//        Circle circle2 = circle1.copy();
//
//        System.out.println(circle1.getX()+ ", "+ circle1.getY()+", "+circle1.getR());
//        System.out.println(circle2.getX()+ ", "+ circle2.getY()+", "+circle2.getR());

        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
        Computer computer = factory.makeAndGet();

        System.out.println(computer);

    }
}
