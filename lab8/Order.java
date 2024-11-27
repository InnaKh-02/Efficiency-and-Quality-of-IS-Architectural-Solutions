package com.epam.training.student_inna_kononenko;

public class Order{
    private String orderId;
    private String status;

    public Order(String orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }
}
