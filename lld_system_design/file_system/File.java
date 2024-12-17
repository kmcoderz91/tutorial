package com.design.file_system;

public class File extends INode {

    private int size;

    public File(String name, int size) {
        super(name, null);
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
