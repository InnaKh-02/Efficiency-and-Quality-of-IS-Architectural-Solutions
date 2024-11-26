package com.epam.training.student_inna_kononenko;

public class DeliveryContext {
    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void executeDeliveryMethod() {
        if (deliveryStrategy == null) {
            throw new IllegalStateException("Delivery strategy not set");
        }
        deliveryStrategy.sendMessageOfChoice();
    }
}
