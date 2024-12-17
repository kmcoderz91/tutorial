package com.design.garbage_collector;

import java.util.HashSet;
import java.util.Set;

public class MarkAndSweepAlgorithm {
    private Heap heap;
    private RootSet rootSet;

    public MarkAndSweepAlgorithm(Heap heap, RootSet rootSet) {
        this.heap = heap;
        this.rootSet = rootSet;
    }

    public void execute() {
        Set<MemoryBlock> markedBlocks = new HashSet<>();

        // Mark phase
        for (MemoryBlock root : rootSet.getRoots()) {
            mark(root, markedBlocks);
        }

        // Sweep phase
        sweep(markedBlocks);
    }

    private void mark(MemoryBlock block, Set<MemoryBlock> markedBlocks) {
        if (block == null || markedBlocks.contains(block)) {
            return;
        }
        block.setMarked(true);
        markedBlocks.add(block);

        for (MemoryBlock reference : block.getReferences()) {
            mark(reference, markedBlocks);
        }
    }

    private void sweep(Set<MemoryBlock> markedBlocks) {
        for (MemoryBlock block : heap.getBlocks()) {
            if (!markedBlocks.contains(block)) {
                heap.deallocate(block);
            }
        }
    }
}
