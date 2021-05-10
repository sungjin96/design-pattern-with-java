package com.design.pattern.builder.v1;

/**
 * Created by marathoner on 2021/05/10
 */
public class ComputerFactory {

    private Blueprint blueprint;

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    public Blueprint getBlueprint() {
        return blueprint;
    }

    public Computer makeAndGet() {
        make();
        return getComputer();
    }

    public void make() {
        blueprint.setRam();
        blueprint.setCpu();
        blueprint.setStorage();
    }

    public Computer getComputer() {
        return blueprint.getComputer();
    }
}
