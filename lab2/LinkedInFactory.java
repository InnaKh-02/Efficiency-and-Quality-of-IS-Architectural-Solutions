package org.example;

public class LinkedInFactory implements SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork(String email, String password) {
        boolean a = email!=null && !email.isEmpty();
        boolean b = password!=null && !password.isEmpty();
        if (a && b){
            return new LinkedIn(email, password);
        }
        else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
