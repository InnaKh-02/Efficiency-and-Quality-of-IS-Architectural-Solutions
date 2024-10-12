package org.example;

public class Main {
    public static void main(String[] args) {
        SimpleDownloader simpleDownloader = new SimpleDownloader();

        CachingDownloader cachingDownloader = new CachingDownloader(simpleDownloader);

        String data1 = cachingDownloader.download("https://example.com/file1");
        System.out.println(data1);

        String data2 = cachingDownloader.download("https://example.com/file1");
        System.out.println(data2);

        String data3 = cachingDownloader.download("https://example.com/file2");
        System.out.println(data3);
    }
}