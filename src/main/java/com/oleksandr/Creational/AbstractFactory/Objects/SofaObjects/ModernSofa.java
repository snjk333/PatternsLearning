package com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects;

public class ModernSofa implements Sofa{

    public ModernSofa() {
        System.out.println("Modern Sofa has been created");
    }

    @Override
    public void relaxOnSofa() {
        System.out.println("Modern Sofa: You do relax");
    }
}
