package com.oleksandr.Creational.Builder.Director;

import com.oleksandr.Creational.Builder.Builders.Builder;


public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeSimpleObject() {
        builder.reset();
        builder.buildStepA();
    }
    public void makeAdvancedObject() {
        builder.reset();
        builder.buildStepA();
        builder.buildStepB();
    }
    public void makeFullObject() {
        builder.reset();
        builder.buildStepA();
        builder.buildStepB();
        builder.buildStepD();
    }

}
