package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marathoner on 2021/05/13
 */
public class Folder extends Component{

    List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(Component component) {
       return children.add(component);
    }

    public boolean removeComponent(Component component) {
        return children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }
}
