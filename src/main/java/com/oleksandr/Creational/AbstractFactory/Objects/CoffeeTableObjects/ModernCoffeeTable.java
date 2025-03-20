package com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects;

public class ModernCoffeeTable implements CoffeeTable {
    public ModernCoffeeTable() {
        System.out.println("Modern Coffee Table has been created");
    }

    @Override
    public void CoffeeTime() {
        System.out.println("ModernCoffeeTable: It's Coffee Time, baby");
    }
}
