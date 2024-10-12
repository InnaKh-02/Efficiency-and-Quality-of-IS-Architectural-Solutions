package org.example;

public class Main {
    public static void main(String[] args) {
        SocialNetworkFactory userFabric = new FacebookFactory();
        SocialNetwork user = userFabric.createSocialNetwork("user_facebook_login", "facebook_password");
        user.postMessage("Hello Facebook!");

        userFabric = new LinkedInFactory();
        user = userFabric.createSocialNetwork("user@linkedin.com", "linkedin_password");
        user.postMessage("Hello LinkedIn!");
    }
}