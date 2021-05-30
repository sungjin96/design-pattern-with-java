package com.design.pattern.command;

/**
 * Created by marathoner on 2021/05/30
 */
public interface Command extends Comparable<Command>{
    void execute();
}
