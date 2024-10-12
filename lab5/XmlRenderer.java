package org.example;

public class XmlRenderer implements Renderer {
    @Override
    public void render(Page page) {
        System.out.println("<page><title>" + page.getTitle() + "</title><content>" + page.getContent() + "</content></page>");
    }

}
