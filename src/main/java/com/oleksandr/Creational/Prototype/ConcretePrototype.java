package com.oleksandr.Creational.Prototype;

public class ConcretePrototype implements Prototype {
    private final String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    protected ConcretePrototype(ConcretePrototype prototype) {
        this.data = prototype.data;
    }

    public String getData() {
        return data;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype with data: " + data;
    }
}
