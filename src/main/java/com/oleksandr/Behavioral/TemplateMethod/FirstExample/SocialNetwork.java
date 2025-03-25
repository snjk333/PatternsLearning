package com.oleksandr.Behavioral.TemplateMethod.FirstExample;

public abstract class SocialNetwork {

    private final String login;
    private final String password;

    public SocialNetwork(String login, String password) {
        this.login = login;
        this.password = password;
    }

    abstract boolean login(String login, String password);

    abstract void publish(String message);

    abstract void logout(String login);

    public void createPost(String message){
        boolean isSuccessLogin = login(this.login, this.password);

        if(isSuccessLogin){
            publish(message);
            logout(this.login);
        }
    }

}
