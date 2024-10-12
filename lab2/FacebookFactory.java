package org.example;

public class FacebookFactory implements SocialNetworkFactory {

    @Override
    public SocialNetwork createSocialNetwork(String login, String password) {
        boolean a = login!=null && !login.isEmpty();
        boolean b = password!=null && !password.isEmpty();
        if (a && b){
        return new Facebook(login, password);
        }
        else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}