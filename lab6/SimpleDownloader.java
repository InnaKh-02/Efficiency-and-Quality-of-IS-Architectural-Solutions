package org.example;

public class SimpleDownloader implements Downloader {
    @Override
    public String download(String url) {
        return "Data from " + url;
    }
}
