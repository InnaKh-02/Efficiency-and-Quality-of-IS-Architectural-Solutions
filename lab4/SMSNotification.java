package org.example;

public class SMSNotification {
    private String phone;
    private String sender;

    public SMSNotification(String phone, String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    public void send(String title, String message) {
        System.out.println("Sent SMS from '" + sender + "' to '" + phone + "' with title '" + title + "' that says '" + message + "'.");
    }
}
