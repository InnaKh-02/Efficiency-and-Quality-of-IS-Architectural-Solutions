package org.example;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("admin@example.com");
        emailNotification.send("Email Subject", "This is an email message.");

        SlackNotification slack = new SlackNotification("user123", "apikeyXYZ", "chat123");
        Notification slackNotification = new SlackNotificationAdapter(new EmailNotification("admin@example.com"), slack);
        slackNotification.send("Slack Notification", "This is a message for Slack.");

        SMSNotification sms = new SMSNotification("+123456789", "MyApp");
        Notification smsNotification = new SMSNotificationAdapter(new EmailNotification("admin@example.com"), sms);
        smsNotification.send("SMS Notification", "This is an SMS message.");
    }
}