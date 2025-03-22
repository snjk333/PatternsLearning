package com.oleksandr.Structural.Decorator.SecondExample;

public class ConcreteDecorator extends BaseDecorator {

    public ConcreteDecorator(Component wrappee) {
        super(wrappee);
    }
    private void extra(){
        System.out.println("ConcreteDecorator extra");
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }
}
