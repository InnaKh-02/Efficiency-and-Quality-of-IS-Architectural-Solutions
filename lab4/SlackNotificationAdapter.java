package org.example;

public class SlackNotificationAdapter implements Notification {
    private EmailNotification emailNotification;
    private SlackNotification slackNotification;

    public SlackNotificationAdapter(EmailNotification emailNotification, SlackNotification slackNotification) {
        this.emailNotification = emailNotification;
        this.slackNotification = slackNotification;
    }

    @Override
    public void send(String title, String message) {
        emailNotification.send(title, message);
        slackNotification.send(title, message);
    }
}
