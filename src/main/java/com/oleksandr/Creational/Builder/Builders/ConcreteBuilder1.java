package com.oleksandr.Creational.Builder.Builders;

import com.oleksandr.Creational.Builder.Products.Product1;

public class ConcreteBuilder1 implements Builder{

    private Product1 product1;

    @Override
    public void reset() {
        product1 = new Product1();
    }

    @Override
    public void buildStepA() {
        System.out.println("Building step A");
    }

    @Override
    public void buildStepB() {
        System.out.println("Building step B");
    }

    @Override
    public void buildStepD() {
        System.out.println("Building step D");
    }

    public Product1 getProduct1() {
        return product1;
    }
}
