package com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects;

public class VictorianSofa implements Sofa{
    public VictorianSofa() {
        System.out.println("Victorian Sofa has been created");
    }

    @Override
    public void relaxOnSofa() {
        System.out.println("Victorian Sofa: You do relax");
    }
}
