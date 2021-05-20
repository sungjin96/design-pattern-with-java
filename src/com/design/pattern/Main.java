package com.design.pattern;

import com.design.pattern.chainOfResposibility.v1.Calculator;
import com.design.pattern.chainOfResposibility.v1.PlusCalculator;
import com.design.pattern.chainOfResposibility.v1.Request;
import com.design.pattern.chainOfResposibility.v1.SubCalculator;
import com.design.pattern.chainOfResposibility.v2.Armor;
import com.design.pattern.chainOfResposibility.v2.Attack;
import com.design.pattern.facade.Facade;
import com.design.pattern.observer.Button;

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
//        GuiFac fac = FactoryInstance.getGuiFac();
//        Button button = fac.createButton();
//        TextArea textArea = fac.createTextArea();
//        button.click();
//        System.out.println(textArea.getText());
//        --------------------------------------------------------------

//        ------------------- Bridge Pattern ------------------------
//        PrintMorseCode code = new PrintMorseCode(new SoundMCF());
//        code.g().a().r().a().m();
//        --------------------------------------------------------------

//        ------------------- Composite Pattern ------------------------
//        Folder root = new Folder("root"), home = new Folder("home"), sungjin = new Folder("sungjin"), music = new Folder("music"), picture = new Folder("picture"), doc = new Folder("doc"), usr = new Folder("usr");
//        File track1 = new File("track1"), track2 = new File("track2"), pric1 = new File("pric1"), doc1 = new File("doc1"), java = new File("java");
//
//        root.addComponent(home);
//        home.addComponent(sungjin);
//        sungjin.addComponent(music);
//        sungjin.addComponent(picture);
//        sungjin.addComponent(doc);
//        music.addComponent(track1);
//        music.addComponent(track2);
//        picture.addComponent(pric1);
//        doc.addComponent(doc1);
//        root.addComponent(usr);
//        usr.addComponent(java);
//        --------------------------------------------------------------
//        ------------------- Decorator Pattern ------------------------
//        Scanner sc = new Scanner(System.in);
//        IBeverage beverage = new Base();
//        boolean done = false;
//        while (!done) {
//            System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
//            System.out.println("선택 : 1:샷추가 / 2:우유추가");
//            switch (sc.nextInt()) {
//                case 0:
//                    done = true;
//                    break;
//                case 1:
//                    beverage = new Espresso(beverage);
//                    break;
//                case 2:
//                    beverage = new Milk(beverage);
//                    break;
//            }
//        }
//        System.out.println("음료 가격 : " + beverage.getTotalPrice());
//        sc.close();
//        --------------------------------------------------------------

//        ------------------- Visitor Pattern ------------------------
//        Visitor visitor = new VisitorA();
//        List<Visitable> visitables = new ArrayList<>();
//        visitables.add(new VisitableA(5));
//        visitables.add(new VisitableA(2));
//        visitables.add(new VisitableA(1));
//        visitables.add(new VisitableA(7));
//
//        for (Visitable visitable : visitables) {
//            visitable.accept(visitor);
//        }
//        System.out.println(visitor.getAgeSum());
//        --------------------------------------------------------------

//        ------------------- Chain Of Resposibility Pattern ------------------------
//        Attack attack = new Attack(100);
//
//        Armor armor1 = new Armor(10);
//        Armor armor2 = new Armor(15);
//
//        armor1.setNextDefense(armor2);
//        armor1.defense(attack);
//
//        System.out.println(attack.getAmount());
//        --------------------------------------------------------------

//        ------------------- Observer Pattern ------------------------
//        Button button = new Button();
//        button.setOnClickListener((btn) -> {
//            System.out.println(btn+" is Clicked");
//        });
//        button.onClick();
//        --------------------------------------------------------------

//        ------------------- Facade Pattern ------------------------
        Facade facade = new Facade();
        facade.process();
//        -------------------------------------------------------------

    }
}
