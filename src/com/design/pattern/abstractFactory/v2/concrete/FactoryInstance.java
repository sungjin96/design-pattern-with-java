package com.design.pattern.abstractFactory.v2.concrete;

import com.design.pattern.abstractFactory.v2.abst.Button;
import com.design.pattern.abstractFactory.v2.abst.GuiFac;
import com.design.pattern.abstractFactory.v2.abst.TextArea;

/**
 * Created by marathoner on 2021/05/11
 */
public class FactoryInstance {

    private static class LinuxGuiFac implements GuiFac {
        @Override
        public Button createButton() {
            return new LinuxButton();
        }

        @Override
        public TextArea createTextArea() {
            return new LinuxTextArea();
        }
    }

    private static class LinuxButton implements Button {
        @Override
        public void click() {
            System.out.println("Clicked!!!!!");
        }
    }

    private static class LinuxTextArea implements TextArea {
        @Override
        public String getText() {
            return "리눅스 텍스트";
        }
    }

    private static class MacFac implements GuiFac {
        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public TextArea createTextArea() {
            return new MacTextArea();
        }
    }

    private static class MacButton implements Button {
        @Override
        public void click() {
            System.out.println("Mac Clicked!!");
        }
    }

    private static class MacTextArea implements TextArea {
        @Override
        public String getText() {
            return "MacText";
        }
    }

    public static GuiFac getGuiFac() {
        switch (getOsCode()) {
            case 0:
                return new MacFac();
            case 1:
                return new LinuxGuiFac();
            default:
                throw new RuntimeException();
        }
    }

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            return 0;
        } else if (System.getProperty("os.name").equals("Linux")) {
            return 1;
        }

        return -1;
    }
}
