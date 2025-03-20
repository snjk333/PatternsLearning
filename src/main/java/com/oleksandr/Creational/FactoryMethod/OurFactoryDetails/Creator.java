package com.oleksandr.Creational.FactoryMethod.OurFactoryDetails;

import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.Product;

public abstract class Creator {

    public void doOperations() {
        Product product = createProduct();
        product.doSomething();
    }

    public abstract Product createProduct();

}
