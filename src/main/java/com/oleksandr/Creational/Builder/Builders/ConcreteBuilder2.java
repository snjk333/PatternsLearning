package com.oleksandr.Creational.Builder.Builders;

import com.oleksandr.Creational.Builder.Products.Product2;

public class ConcreteBuilder2 implements Builder{
    private Product2 product2;

    @Override
    public void reset() {
        product2 = new Product2();
    }

    @Override
    public void buildStepA() {
        System.out.println("Step A");
    }

    @Override
    public void buildStepB() {
        System.out.println("Step B");
    }

    @Override
    public void buildStepD() {
        System.out.println("Step D");
    }

    public Product2 getProduct2() {
        return product2;
    }
}
