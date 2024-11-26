package com.epam.training.student_inna_kononenko;

public class Main {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();

        context.setDeliveryStrategy(new PickupStrategy());
        context.executeDeliveryMethod();

        context.setDeliveryStrategy(new ExternalDeliveryStrategy());
        context.executeDeliveryMethod();

        context.setDeliveryStrategy(new InternalDeliveryStrategy());
        context.executeDeliveryMethod();
    }
}