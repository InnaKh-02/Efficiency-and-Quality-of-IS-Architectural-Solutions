package org.example;

import java.util.HashMap;
import java.util.Map;

public class CachingDownloader implements Downloader {

    private Map<String, String> cache;
    private SimpleDownloader downloader;

    public CachingDownloader(SimpleDownloader downloader) {
        this.downloader = downloader;
        this.cache = new HashMap<>();
    }

    @Override
    public String download(String url) {
        if (cache.containsKey(url)) {
            System.out.println("Returning cached data for: " + url);
            return cache.get(url);
        } else {
            String data = downloader.download(url);
            cache.put(url, data);
            return data;
        }
    }
}
