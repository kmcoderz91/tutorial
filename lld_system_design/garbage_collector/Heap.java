package com.design.garbage_collector;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<MemoryBlock> blocks;
    private int size;

    public Heap(int size) {
        this.size = size;
        this.blocks = new ArrayList<>();
    }

    public MemoryBlock allocate(int size) {
        if (getFreeMemory() >= size) {
            MemoryBlock block = new MemoryBlock(size);
            blocks.add(block);
            return block;
        } else {
            throw new OutOfMemoryError("Not enough memory to allocate.");
        }
    }

    public void deallocate(MemoryBlock block) {
        block.setMarked(false);
        blocks.remove(block);
    }

    public int getFreeMemory() {
        return size - blocks.stream().mapToInt(MemoryBlock::getSize).sum();
    }

    public List<MemoryBlock> getBlocks() {
        return blocks;
    }
}
