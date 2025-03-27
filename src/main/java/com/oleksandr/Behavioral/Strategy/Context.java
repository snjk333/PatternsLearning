package com.oleksandr.Behavioral.Strategy;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomething(String data) {
        strategy.execute(data);
    }
}
