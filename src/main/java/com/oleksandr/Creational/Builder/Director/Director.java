package com.oleksandr.Creational.Builder.Director;

import com.oleksandr.Creational.Builder.Builders.Builder;
import com.oleksandr.Creational.Builder.Products.Product;


public class Director {
    private Builder<? extends Product> builder;

    public Director(Builder<? extends Product> builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder<? extends Product> builder) {
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
