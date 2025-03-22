package com.oleksandr.Structural.Decorator.FirstExample.Decorators;

import com.oleksandr.Structural.Decorator.FirstExample.Notifier;

public class InstagramDecorator extends BaseDecorator {
    public InstagramDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Instagram message: " + message);
    }
}
