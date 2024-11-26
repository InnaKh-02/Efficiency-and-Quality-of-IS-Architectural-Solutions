package com.epam.training.student_inna_kononenko;

public class InternalDeliveryStrategy implements DeliveryStrategy{
    @Override
    public void sendMessageOfChoice() {
        System.out.println("You have chosen delivery by your own service. Expect delivery from our courier.");
    }
}
