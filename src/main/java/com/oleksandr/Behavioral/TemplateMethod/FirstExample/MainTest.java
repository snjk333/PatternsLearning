package com.oleksandr.Behavioral.TemplateMethod.FirstExample;

public class MainTest {
    public static void main(String[] args) {

        SocialNetwork instagram = new Instagram("user", "12345");
        instagram.createPost("Hi, i'm instagram :-)");

        SocialNetwork facebook = new Facebook("smart", "qwerty");
        facebook.createPost("Hi, i'm facebook :-O");

    }
}
