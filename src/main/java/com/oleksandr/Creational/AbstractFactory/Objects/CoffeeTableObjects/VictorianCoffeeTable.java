package com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects;

public class VictorianCoffeeTable implements CoffeeTable {
    public VictorianCoffeeTable() {
        System.out.println("Victorian Coffee Table has been created");
    }

    @Override
    public void CoffeeTime() {
        System.out.println("VictorianTable: It's Coffee Time, baby");
    }
}
