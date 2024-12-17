package com.design.garbage_collector;

public class GarbageCollectorControl {
    public static void main(String[] args) {
        GarbageCollector gc = new GarbageCollector(100);

        // Allocate memory blocks
        MemoryBlock block1 = gc.allocate(10);
        MemoryBlock block2 = gc.allocate(20);
        MemoryBlock block3 = gc.allocate(30);

        // Set up references
        block1.addReference(block2);
        block2.addReference(block3);

        // Add block1 to the root set
        gc.addToRootSet(block1);

        // Trigger garbage collection
        gc.collect();
    }
}
