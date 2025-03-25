package com.oleksandr.Behavioral.TemplateMethod.FirstExample;

public class Instagram extends SocialNetwork{

    public Instagram(String login, String password) {
        super(login, password);
    }

    @Override
    boolean login(String login, String password) {
        System.out.println("Success Instagram login for user: " + login);
        return true;
    }

    @Override
    void publish(String message) {
        System.out.println("Success Instagram publish message: " + message);
    }

    @Override
    void logout(String login) {
        System.out.println("Success Instagram logout for user: " + login);
    }
}
