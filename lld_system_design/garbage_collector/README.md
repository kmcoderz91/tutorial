# Garbage Collector
## Key Components
A garbage collector in Java typically operates in Managed Memory (Heap) and includes the following key tasks :
* Memory Allocation : Manage memory blocks for object creation.
* Object Marking : Identify which objects are still in use (reachable).
* Sweeping : Free memory occupied by unreachable objects.
* Compaction : Defragment memory to improve efficiency (optional).
* Generational Management : Handle Young Generation, Old Generation, etc. (for performance optimization).

## Class Diagram
* GarbageCollector : Orchestrates GC operations.
* Heap : Represents managed memory space.
* MemoryBlock : Represents a single memory block or allocated object.
* MarkAndSweepAlgorithm : Implements the marking and sweeping algorithm.
* RootSet : Tracks references to root objects (e.g., stack, global variables).
* ObjectGraph : Represents object relationships for traversal.
