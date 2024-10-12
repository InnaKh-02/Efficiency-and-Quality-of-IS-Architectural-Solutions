package org.example;

public class SMSNotificationAdapter implements Notification {
    private EmailNotification emailNotification;
    private SMSNotification smsNotification;

    public SMSNotificationAdapter(EmailNotification emailNotification, SMSNotification smsNotification) {
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
    }

    @Override
    public void send(String title, String message) {
        emailNotification.send(title, message);
        smsNotification.send(title, message);
    }
}
