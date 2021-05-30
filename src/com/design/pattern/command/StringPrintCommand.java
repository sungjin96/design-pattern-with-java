package com.design.pattern.command;

/**
 * Created by marathoner on 2021/05/30
 */
public class StringPrintCommand implements Command{

    protected String string;

    public StringPrintCommand(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println(this.string);
    }

    @Override
    public int compareTo(Command o) {
        StringPrintCommand other = (StringPrintCommand) o;
        return this.string.length() - other.string.length();
    }
}
