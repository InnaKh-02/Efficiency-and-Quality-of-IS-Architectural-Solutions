package com.epam.training.student_inna_kononenko;

public class OrderUpdater extends EntityUpdater {
    private Order order;

    public OrderUpdater(Order ord) {
        order = ord;
    }

    public void setOrderToUpdate(Order ord){
        order = ord;
    }

    @Override
    protected void validateEntity() {
        if (order.getOrderId() == null || order.getStatus() == null) {
            throw new IllegalArgumentException("Invalid order object");
        }
    }

    @Override
    protected void saveEntity() {
        System.out.println("Saving order: " + order.getOrderId());
    }

    @Override
    protected void postProcess() {
        System.out.println("Returning JSON representation of order: { id: " + order.getOrderId()
                + ", status: " + order.getStatus() + " }");
    }
}