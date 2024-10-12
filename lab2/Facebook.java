package org.example;

public class Facebook implements SocialNetwork {
    private String login;
    private String password;

    public Facebook(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public void login(String identifier, String password) {
        boolean a = this.login == identifier;
        boolean b = this.password == password;
        if(a && b){
            System.out.println("Logged into Facebook: " + identifier);
        }
        else{
            throw new IllegalArgumentException("Invalid input");
        }
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Posting message to Facebook: " + message);
    }
}