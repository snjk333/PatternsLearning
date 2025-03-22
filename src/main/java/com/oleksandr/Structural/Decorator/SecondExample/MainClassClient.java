package com.oleksandr.Structural.Decorator.SecondExample;

public class MainClassClient {
    public static void main(String[] args) {

        Component c1 = new ConcreteComponent();
        c1.execute();
        System.out.println("===============================");
        Component c2 = new BaseDecorator(new ConcreteComponent());
        c2.execute();
        System.out.println("===============================");
        Component c3 = new ConcreteDecorator(new ConcreteComponent());
        c3.execute();


    }
}
