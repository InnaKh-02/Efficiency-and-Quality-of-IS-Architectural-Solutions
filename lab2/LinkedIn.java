package org.example;

public class LinkedIn implements SocialNetwork {
    private String email;
    private String password;

    public LinkedIn( String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void login(String identifier, String password) {
        boolean a = this.email == identifier;
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
        System.out.println("Posting message to LinkedIn: " + message);
    }
}