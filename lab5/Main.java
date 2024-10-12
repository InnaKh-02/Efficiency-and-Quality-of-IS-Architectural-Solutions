package org.example;

public class Main {
    public static void main(String[] args) {
        SimplePage simplePage = new SimplePage("Home", "Welcome to our website!");
        Product product = new Product("Laptop", "High-performance laptop.", "laptop.jpg", 12345);
        ProductPage productPage = new ProductPage(product);

        Renderer htmlRenderer = new HTMLRenderer();
        Renderer jsonRenderer = new JsonRenderer();
        Renderer xmlRenderer = new XmlRenderer();

        System.out.println("HTML Rendering:");
        simplePage.render(htmlRenderer);
        productPage.render(htmlRenderer);

        System.out.println("\nJSON Rendering:");
        simplePage.render(jsonRenderer);
        productPage.render(jsonRenderer);

        System.out.println("\nXML Rendering:");
        simplePage.render(xmlRenderer);
        productPage.render(xmlRenderer);
    }
}