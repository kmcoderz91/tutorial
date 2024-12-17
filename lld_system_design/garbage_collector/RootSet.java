package com.design.garbage_collector;

import java.util.HashSet;
import java.util.Set;

// The root set tracks references to "live" objects.
public class RootSet {
    private Set<MemoryBlock> roots;
    public RootSet() {
        this.roots = new HashSet<>();
    }

    public void add(MemoryBlock block) {
        roots.add(block);
    }

    public Set<MemoryBlock> getRoots() {
        return roots;
    }
}
