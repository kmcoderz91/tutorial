package com.design.file_system;

public abstract class INode {
    protected String name;
    protected Directory parent;

    public INode(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public Directory getParent() {
        return parent;
    }

    public abstract int getSize();
}
