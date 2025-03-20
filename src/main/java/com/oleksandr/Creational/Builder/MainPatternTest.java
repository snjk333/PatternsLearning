package com.oleksandr.Creational.Builder;

import com.oleksandr.Creational.Builder.Builders.Builder;
import com.oleksandr.Creational.Builder.Builders.ConcreteBuilder1;
import com.oleksandr.Creational.Builder.Builders.ConcreteBuilder2;
import com.oleksandr.Creational.Builder.Director.Director;
import com.oleksandr.Creational.Builder.Products.Product1;
import com.oleksandr.Creational.Builder.Products.Product2;

public class MainPatternTest {
    public static void main(String[] args) {
        var b = new ConcreteBuilder1();
        var d = new Director(b);

        d.makeSimpleObject();
        Product1 firstP1 = b.getProduct1();
        d.makeAdvancedObject();
        Product1 secondP1 = b.getProduct1();
        d.makeFullObject();
        Product1 thirdP1 = b.getProduct1();

        var b2 = new ConcreteBuilder2();
        d.changeBuilder(b2);

        d.makeSimpleObject();
        Product2 firstP2 = b2.getProduct2();
        d.makeAdvancedObject();
        Product2 secondP2 = b2.getProduct2();
        d.makeFullObject();
        Product2 thirdP2 = b2.getProduct2();
    }
}
