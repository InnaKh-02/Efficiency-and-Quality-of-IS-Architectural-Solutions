package org.example;

public class AmazonS3Storage implements Storage{

    @Override
    public void saveFile(String fileName, String data) {

    }

    @Override
    public String readFile(String fileName) {
        return "Reading file from local disk: " + fileName;
    }
}
