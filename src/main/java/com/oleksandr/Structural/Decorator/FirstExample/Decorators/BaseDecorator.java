package com.oleksandr.Structural.Decorator.FirstExample.Decorators;

import com.oleksandr.Structural.Decorator.FirstExample.Notifier;

public abstract class BaseDecorator extends Notifier{
    protected Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}
