package com.design.pattern.builder.v1;

/**
 * Created by marathoner on 2021/05/10
 */
public class LgGramBlueprint extends Blueprint{

    private final Computer computer;

    public LgGramBlueprint() {
        this.computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i10-11000");
    }

    @Override
    public void setRam() {
        computer.setRam("64g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1T");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
