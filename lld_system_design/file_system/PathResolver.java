package com.design.file_system;

public class PathResolver {
    public static Directory resolve(String path, Directory current, Directory root) throws FileSystemException {
        if (path.equals("/")) {
            return root;
        }

        String[] parts = path.split("/");
        Directory target = path.startsWith("/") ? root : current;

        for (String part : parts) {
            if (part.equals("..")) {
                if (target.getParent() != null) {
                    target = target.getParent();
                }
            } else if (!part.equals("") && !part.equals(".")) {
                INode child = target.findChild(part);
                if (child instanceof Directory) {
                    target = (Directory) child;
                } else {
                    throw new FileSystemException("Invalid path: " + path);
                }
            }
        }

        return target;
    }
}
