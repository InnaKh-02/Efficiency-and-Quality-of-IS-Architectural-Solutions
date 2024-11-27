package com.epam.training.student_inna_kononenko;

public abstract class EntityUpdater {

    public final void updateEntity() {
        validateEntity();
        prepareSaveRequest();
        saveEntity();
        postProcess();
    }

    protected abstract void validateEntity();

    protected void prepareSaveRequest() {
        System.out.println("Preparing save request...");
    }

    protected abstract void saveEntity();

    protected void postProcess() {
    }
}
