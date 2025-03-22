package com.oleksandr.Structural.Decorator.FirstExample;

import com.oleksandr.Structural.Decorator.FirstExample.Decorators.FacebookDecorator;
import com.oleksandr.Structural.Decorator.FirstExample.Decorators.InstagramDecorator;
import com.oleksandr.Structural.Decorator.FirstExample.Decorators.SMSDecorator;

public class MainClass {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();

        notifier = new FacebookDecorator(notifier);
        notifier = new InstagramDecorator(notifier);
        notifier = new SMSDecorator(notifier);

        notifier.send("Alert! Something happened.");
        //SMSDecorator → InstagramDecorator → FacebookDecorator → Notifier
    }
}
