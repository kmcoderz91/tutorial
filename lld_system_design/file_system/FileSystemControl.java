package com.design.file_system;

public class FileSystemControl {
    public static void main(String[] args) {
        try {
            FileSystem fs = new FileSystem();

            // Create directories and files
            fs.createDirectory("docs");
            fs.changeDirectory("docs");
            fs.createFile("file1.txt", 100);
            fs.createFile("file2.txt", 200);

            // List contents
            fs.listContents();

            // Navigate back to root
            fs.changeDirectory("..");
            fs.listContents();

        } catch (FileSystemException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
