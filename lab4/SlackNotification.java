package org.example;

public class SlackNotification{
    private String login;
    private String apiKey;
    private String chatId;

    public SlackNotification(String login, String apiKey, String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    public void send(String title, String message) {
        System.out.println("Sent Slack message to chat '" + chatId + "' with title '" + title + "' that says '" + message + "'.");
    }
}
