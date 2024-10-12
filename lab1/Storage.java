package org.example;

public interface Storage {
    void saveFile(String fileName, String data);
    String readFile(String fileName);
}
