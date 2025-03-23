package com.oleksandr.Behavioral.Observer;

import java.util.Observer;

public class NewsChannel implements Channel {

    private final String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ", received: " + message) ;
    }
}
