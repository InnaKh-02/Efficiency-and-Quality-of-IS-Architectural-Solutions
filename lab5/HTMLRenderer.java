package org.example;

public class HTMLRenderer implements Renderer {
    @Override
    public void render(Page page) {
        System.out.println("<html><head><title>" + page.getTitle() + "</title></head>");
        System.out.println("<body><h1>" + page.getTitle() + "</h1><p>" + page.getContent() + "</p></body></html>");
    }

}
