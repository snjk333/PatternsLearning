package com.oleksandr.Structural.Decorator.SecondExample;

public class BaseDecorator implements Component {
    Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
