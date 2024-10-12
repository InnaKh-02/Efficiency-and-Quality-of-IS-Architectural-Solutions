package org.example;

public class LocalStorage implements Storage{
    @Override
    public void saveFile(String fileName, String data) {

    }

    @Override
    public String readFile(String fileName) {
        return "Reading file from Amazon S3: " + fileName;
    }
}
