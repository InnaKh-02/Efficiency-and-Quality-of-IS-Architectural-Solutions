package com.epam.training.student_inna_kononenko;

public class UserUpdater extends EntityUpdater {
    private User user;

    public UserUpdater(User u) {
        user = u;
    }

    @Override
    protected void validateEntity() {
        if (user.getEmail() != null) {
            throw new IllegalArgumentException("Changing email is not allowed");
        }
    }

    @Override
    protected void saveEntity() {
        System.out.println("Saving user...");
    }
}