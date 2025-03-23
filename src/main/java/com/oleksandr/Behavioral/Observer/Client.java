package com.oleksandr.Behavioral.Observer;

public class Client {
    public static void main(String[] args) {

        NewsPortal newsPortal = new NewsPortal();

        NewsChannel newsChannel = new NewsChannel("FirstChannel");
        NewsChannel newsChannel2 = new NewsChannel("SecondChannel");

        newsPortal.subscribe(newsChannel);
        newsPortal.subscribe(newsChannel2);

        newsPortal.publish("Hello World");

        newsPortal.unsubscribe(newsChannel);
        System.out.println("===================");
        newsPortal.publish("We unsubscribed first news channel :)");

    }
}
