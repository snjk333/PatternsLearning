package com.oleksandr.Creational.Builder.FirstExample.Builders;

import com.oleksandr.Creational.Builder.FirstExample.Products.Product1;

public class ConcreteBuilder1 implements Builder<Product1> {

    private Product1 product1;

    @Override
    public void reset() {
        product1 = new Product1();
    }

    @Override
    public void buildStepA() {
        System.out.println("Building step A");
        product1.setPartA("Step A for Product1");
    }

    @Override
    public void buildStepB() {
        System.out.println("Building step B");
        product1.setPartA("Step B for Product1");
    }

    @Override
    public void buildStepD() {
        System.out.println("Building step D");
        product1.setPartA("Step D for Product1");
    }

    @Override
    public Product1 getProduct() {
        return product1;
    }

}
