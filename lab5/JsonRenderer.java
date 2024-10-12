package org.example;

public class JsonRenderer implements Renderer {
    @Override
    public void render(Page page) {
        System.out.println("{ \"title\": \"" + page.getTitle() + "\", \"content\": \"" + page.getContent() + "\" }");
    }

}
