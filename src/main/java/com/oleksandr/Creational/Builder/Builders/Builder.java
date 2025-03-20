package com.oleksandr.Creational.Builder.Builders;

import com.oleksandr.Creational.Builder.Products.Product;

public interface Builder <T extends Product> {
    void reset();
    void buildStepA();
    void buildStepB();
    void buildStepD();
    T getProduct();
}
