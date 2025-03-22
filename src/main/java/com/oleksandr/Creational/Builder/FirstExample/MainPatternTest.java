package com.oleksandr.Creational.Builder.FirstExample;

import com.oleksandr.Creational.Builder.FirstExample.Builders.ConcreteBuilder1;
import com.oleksandr.Creational.Builder.FirstExample.Builders.ConcreteBuilder2;
import com.oleksandr.Creational.Builder.FirstExample.Director.Director;
import com.oleksandr.Creational.Builder.FirstExample.Products.Product;

public class MainPatternTest {
    public static void main(String[] args) {

        ConcreteBuilder1 builder1 = new ConcreteBuilder1(); //make concrete builder for products 1
        Director director = new Director(builder1); // make director using builder1

        director.makeFullObject(); //director make an object using builder
        Product product1 = builder1.getProduct(); // and we get object from builder
        System.out.println(product1);

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        director.changeBuilder(builder2);

        director.makeAdvancedObject();
        Product product2 = builder2.getProduct();
        System.out.println(product2);
    }
}
