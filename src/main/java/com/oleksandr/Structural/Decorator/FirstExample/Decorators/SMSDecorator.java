package com.oleksandr.Structural.Decorator.FirstExample.Decorators;

import com.oleksandr.Structural.Decorator.FirstExample.Notifier;

public class SMSDecorator extends BaseDecorator{

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS message: " + message);
    }
}
