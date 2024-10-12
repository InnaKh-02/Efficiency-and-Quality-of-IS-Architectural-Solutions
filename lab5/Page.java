package org.example;

public interface Page {
    String getTitle();
    String getContent();
    void render(Renderer renderer);
}

