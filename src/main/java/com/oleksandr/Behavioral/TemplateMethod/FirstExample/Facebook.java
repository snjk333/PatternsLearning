package com.oleksandr.Behavioral.TemplateMethod.FirstExample;

public class Facebook extends SocialNetwork{

    public Facebook(String login, String password) {
        super(login, password);
    }

    @Override
    boolean login(String login, String password) {
        System.out.println("Success Facebook login for user: " + login);
        return true;
    }

    @Override
    void publish(String message) {
        System.out.println("Success Facebook publish message: " + message);
    }

    @Override
    void logout(String login) {
        System.out.println("Success Facebook logout for user: " + login);
    }
}
