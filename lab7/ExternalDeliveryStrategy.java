package com.epam.training.student_inna_kononenko;

public class ExternalDeliveryStrategy implements DeliveryStrategy{
    @Override
    public void sendMessageOfChoice() {
        System.out.println("You have chosen delivery by an external service. Wait for the courier.");
    }
}
