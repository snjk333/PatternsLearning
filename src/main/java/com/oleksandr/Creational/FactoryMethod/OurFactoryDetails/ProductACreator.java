package com.oleksandr.Creational.FactoryMethod.OurFactoryDetails;

import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.Product;
import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.ProductA;

public class ProductACreator extends Creator {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
