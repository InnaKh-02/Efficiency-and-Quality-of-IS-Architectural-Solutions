package com.epam.training.student_inna_kononenko;

public class ProductUpdater extends EntityUpdater {
    private Product product;

    public ProductUpdater(Product prod) {
        product = prod;
    }

    @Override
    protected void validateEntity() {
        if (!isValidProduct()) {
            notifyAdmin("Product validation failed!");
            throw new IllegalArgumentException("Product validation failed");
        }
    }

    @Override
    protected void saveEntity() {
        System.out.println("Saving product: " + product.getName());
    }

    private boolean isValidProduct() {
        return true;
    }

    private void notifyAdmin(String message) {
        System.out.println("Notifying admin: " + message);
    }
}
