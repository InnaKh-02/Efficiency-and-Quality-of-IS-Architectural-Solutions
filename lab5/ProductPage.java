package org.example;

public class ProductPage implements Page {
    private Product product;

    public ProductPage(Product product) {
        this.product = product;
    }

    @Override
    public String getTitle() {
        return product.getName();
    }

    @Override
    public String getContent() {
        return "Description: " + product.getDescription() + ", Image: " + product.getImage() + ", ID: " + product.getId();
    }

    @Override
    public void render(Renderer renderer) {
        renderer.render(this);
    }
}

