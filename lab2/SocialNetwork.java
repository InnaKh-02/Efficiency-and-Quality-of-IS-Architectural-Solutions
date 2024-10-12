package org.example;

public interface SocialNetwork {
    void login (String identifier, String password);
    void postMessage(String message);
}
