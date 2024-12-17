package com.design.file_system;

import java.util.ArrayList;
import java.util.List;

public class Directory extends INode {

    private List<INode> children;

    public Directory(String name, Directory parent) {
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public void addChild(INode node) {
        children.add(node);
    }

    public void removeChild(String name) throws FileSystemException {
        INode node = findChild(name);
        if (node == null) {
            throw new FileSystemException("Node not found: " + name);
        }
        children.remove(node);
    }

    public INode findChild(String name) {
        for (INode child : children) {
            if (child.getName().equals(name)) {
                return child;
            }
        }
        return null;
    }

    public List<INode> getChildren() {
        return children;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (INode child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }
}
