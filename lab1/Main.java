package org.example;

public class Main {
    public static void main(String[] args) {
        StorageManager localManager = StorageManager.getInstance("local");
        localManager.saveFile("test.txt", "Hello, World!");
        String content = localManager.readFile("test.txt");
        System.out.println(content);

        StorageManager amazonManager = StorageManager.getInstance("amazon_s3");
        amazonManager.saveFile("test1.txt", "Hello, from S3!");
        content = amazonManager.readFile("test1.txt");
        System.out.println(content);
    }
}