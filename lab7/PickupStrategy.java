package com.epam.training.student_inna_kononenko;

public class PickupStrategy implements DeliveryStrategy{
    @Override
    public void sendMessageOfChoice() {
        System.out.println("You have chosen self-pickup. Pick up your order from the pick-up point.");
    }
}
