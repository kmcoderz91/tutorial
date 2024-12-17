package com.design.file_system;

import java.util.List;

public class FileSystem {
    private Directory root;
    private Directory currentDirectory;

    public FileSystem() {
        this.root = new Directory("root", null);
        this.currentDirectory = root;
    }

    public void createFile(String name, int size) {
        currentDirectory.addChild(new File(name, size));
    }

    public void createDirectory(String name) {
        currentDirectory.addChild(new Directory(name, currentDirectory));
    }

    public void listContents() {
        List<INode> children = currentDirectory.getChildren();
        for (INode child : children) {
            System.out.println(child.getName());
        }
    }

    public void changeDirectory(String path) throws FileSystemException {
        Directory newDir = PathResolver.resolve(path, currentDirectory, root);
        currentDirectory = newDir;
    }

    public void delete(String name) throws FileSystemException {
        currentDirectory.removeChild(name);
    }

    public Directory getRoot() {
        return root;
    }

}
