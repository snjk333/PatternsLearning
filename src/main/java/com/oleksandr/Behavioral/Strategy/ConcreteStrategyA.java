package com.oleksandr.Behavioral.Strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void execute(String data) {
        System.out.println("Using strategy A for data " + data);
    }
}
