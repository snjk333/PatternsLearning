package com.oleksandr.Creational.Builder.FirstExample.Builders;

import com.oleksandr.Creational.Builder.FirstExample.Products.Product2;

public class ConcreteBuilder2 implements Builder<Product2> {
    private Product2 product2;

    @Override
    public void reset() {
        product2 = new Product2();
    }

    @Override
    public void buildStepA() {
        System.out.println("Step A");
        product2.setPartA("Step A for Product2");
    }

    @Override
    public void buildStepB() {
        System.out.println("Step B");
        product2.setPartA("Step B for Product2");
    }

    @Override
    public void buildStepD() {
        System.out.println("Step D");
        product2.setPartA("Step D for Product2");
    }

    @Override
    public Product2 getProduct() {
        return product2;
    }

}
