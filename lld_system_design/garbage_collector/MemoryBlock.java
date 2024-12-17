package com.design.garbage_collector;

import java.util.ArrayList;
import java.util.List;

public class MemoryBlock {
    private int size;
    private boolean isMarked;
    private List<MemoryBlock> references;

    public MemoryBlock(int size) {
        this.size = size;
        this.isMarked = false;
        this.references = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public void setMarked(boolean marked) {
        this.isMarked = marked;
    }

    public List<MemoryBlock> getReferences() {
        return references;
    }

    public void addReference(MemoryBlock block) {
        references.add(block);
    }

}
