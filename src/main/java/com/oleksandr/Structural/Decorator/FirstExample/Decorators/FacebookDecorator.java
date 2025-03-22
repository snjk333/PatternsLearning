package com.oleksandr.Structural.Decorator.FirstExample.Decorators;

import com.oleksandr.Structural.Decorator.FirstExample.Notifier;

public class FacebookDecorator extends BaseDecorator {
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Facebook message: " + message);
    }
}
