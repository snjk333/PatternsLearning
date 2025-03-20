package com.oleksandr.Creational.FactoryMethod.OurFactoryDetails;

import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.Product;
import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.ProductA;
import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.ProductB;

public class ProductBCreator extends Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
