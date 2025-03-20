package com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects;

public class VictorianChair implements Chair{

    public VictorianChair() {
        System.out.println("Modern Chair has been created");
    }

    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has 4 legs");
    }

}
