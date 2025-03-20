package com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects;

public class ModernChair implements Chair {
    public ModernChair() {
        System.out.println("Modern Chair has been created");
    }

    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has 2 legs");
    }

}
