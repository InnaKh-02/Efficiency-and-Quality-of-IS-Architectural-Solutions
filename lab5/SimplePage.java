package org.example;

public class SimplePage implements Page {
    private String title;
    private String content;

    public SimplePage(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void render(Renderer renderer) {
        renderer.render(this);
    }
}

