package com.oleksandr.Creational.FactoryMethod;

import com.oleksandr.Creational.FactoryMethod.OurFactoryDetails.Creator;
import com.oleksandr.Creational.FactoryMethod.OurFactoryDetails.ProductACreator;
import com.oleksandr.Creational.FactoryMethod.OurFactoryDetails.ProductBCreator;
import com.oleksandr.Creational.FactoryMethod.OurObjectDetails.Product;

public class MainTester {
    public static void main(String[] args) {
        Creator creatorA = new ProductACreator();
        creatorA.doOperations();

        Creator creatorB = new ProductBCreator();
        creatorB.doOperations();
    }
}

//https://refactoring.guru/ru/design-patterns/factory-method
