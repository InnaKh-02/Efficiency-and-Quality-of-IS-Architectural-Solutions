package com.epam.training.student_inna_kononenko;

public class Main {
    public static void main(String[] args) {
        EntityUpdater updater = new ProductUpdater(new Product("Laptop", 1200.0));
        
        try {
            updater.updateEntity();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        updater = new UserUpdater(new User("user@example.com"));

        try {
            updater.updateEntity();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        updater = new OrderUpdater(new Order("12345", "Pending"));

        updater.updateEntity();
    }
}