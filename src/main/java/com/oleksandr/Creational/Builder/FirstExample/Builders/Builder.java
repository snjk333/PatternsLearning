package com.oleksandr.Creational.Builder.FirstExample.Builders;

import com.oleksandr.Creational.Builder.FirstExample.Products.Product;

public interface Builder <T extends Product> {
    void reset();
    void buildStepA();
    void buildStepB();
    void buildStepD();
    T getProduct();
}
