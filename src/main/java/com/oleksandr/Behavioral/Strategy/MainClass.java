package com.oleksandr.Behavioral.Strategy;

public class MainClass {

    public static void main(String[] args) {

        Context context = new Context();

        Strategy strategy = new ConcreteStrategyA();

        context.setStrategy(strategy);
        context.doSomething("Hello");

        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.doSomething("World");
    }
}
