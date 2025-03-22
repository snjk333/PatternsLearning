package com.oleksandr.Structural.Decorator.SecondExample;

public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("ConcreteComponent execute");
    }
}
