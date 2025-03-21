package com.oleksandr.Creational.Prototype;

public class SecondConcretePrototype extends ConcretePrototype {
    private String additionalData;

    public SecondConcretePrototype(String data, String additionalData) {
        super(data);
        this.additionalData = additionalData;
    }

    protected SecondConcretePrototype(SecondConcretePrototype prototype) {
        super(prototype);
        this.additionalData = prototype.additionalData;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    @Override
    public SecondConcretePrototype clone() {
        return new SecondConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "SecondConcretePrototype with data: " + getData() + ", additionalData: " + additionalData;
    }
}
