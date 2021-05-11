package com.design.pattern;

import com.design.pattern.abstractFactory.v1.abst.BikeFactory;
import com.design.pattern.abstractFactory.v1.abst.Body;
import com.design.pattern.abstractFactory.v1.abst.Wheel;
import com.design.pattern.abstractFactory.v1.gt.GtFactory;
import com.design.pattern.abstractFactory.v2.abst.Button;
import com.design.pattern.abstractFactory.v2.abst.GuiFac;
import com.design.pattern.abstractFactory.v2.abst.TextArea;
import com.design.pattern.abstractFactory.v2.concrete.FactoryInstance;

/**
 * Created by marathoner on 2021/05/10
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

//        ------------------- Prototype Pattern ------------------------
//        Circle circle1 = new Circle(1,2,3);
//        Circle circle2 = circle1.copy();
//
//        System.out.println(circle1.getX()+ ", "+ circle1.getY()+", "+circle1.getR());
//        System.out.println(circle2.getX()+ ", "+ circle2.getY()+", "+circle2.getR());
//        --------------------------------------------------------------

//        ------------------- Builder Pattern ------------------------
//        ComputerFactory factory = new ComputerFactory();
//        factory.setBlueprint(new LgGramBlueprint());
//        Computer computer = factory.makeAndGet();
//        System.out.println(computer);
//        --------------------------------------------------------------

//        ------------------- Builder Pattern ------------------------
//        Computer computer = ComputerBuilder
//                .builder()
//                .cpu("i7")
//                .ram("8G")
//                .storage("1T")
//                .build();
//        System.out.println(computer);
//        --------------------------------------------------------------

//        ------------------- Abstract Factory Pattern ------------------------
//        BikeFactory factory = new GtFactory();
//        Body body = factory.createBody();
//        Wheel wheel = factory.createWheel();
//
//        System.out.println(body.getClass());
//        System.out.println(wheel.getClass());
//        --------------------------------------------------------------

//        ------------------- Abstract Factory Pattern ------------------------
        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea textArea = fac.createTextArea();
        button.click();
        System.out.println(textArea.getText());
//        --------------------------------------------------------------

    }
}
