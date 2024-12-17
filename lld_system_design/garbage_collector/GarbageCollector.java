package com.design.garbage_collector;

public class GarbageCollector {
    private Heap heap;
    private RootSet rootSet;
    private MarkAndSweepAlgorithm algorithm;

    public GarbageCollector(int heapSize) {
        this.heap = new Heap(heapSize);
        this.rootSet = new RootSet();
        this.algorithm = new MarkAndSweepAlgorithm(heap, rootSet);
    }

    public void collect() {
        System.out.println("Starting garbage collection...");
        algorithm.execute();
        System.out.println("Garbage collection complete.");
    }

    public MemoryBlock allocate(int size) {
        return heap.allocate(size);
    }

    public void addToRootSet(MemoryBlock block) {
        rootSet.add(block);
    }
}
