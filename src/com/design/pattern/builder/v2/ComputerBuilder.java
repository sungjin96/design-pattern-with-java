package com.design.pattern.builder.v2;

import com.design.pattern.builder.v1.Computer;

/**
 * Created by marathoner on 2021/05/11
 */
public class ComputerBuilder {

    private Computer computer;
    private ComputerBuilder() {
        computer = new Computer("default", "default","default");
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public ComputerBuilder cpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder ram(String string) {
        computer.setRam(string);
        return this;
    }

    public ComputerBuilder storage(String string) {
        computer.setStorage(string);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
