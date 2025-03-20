package com.oleksandr.Creational.AbstractFactory;

import com.oleksandr.Creational.AbstractFactory.Factories.FurnitureFactory;
import com.oleksandr.Creational.AbstractFactory.Factories.ModernFurnitureFactory;
import com.oleksandr.Creational.AbstractFactory.Factories.VictorianFurnitureFactory;
import com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects.Chair;
import com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects.CoffeeTable;
import com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects.Sofa;

public class MainTestPattern {
    public static void main(String[] args) {
        System.out.println("Make a full modern furniture");
        FurnitureFactory ModernFactory = new ModernFurnitureFactory();
        Chair modernChair = ModernFactory.createChair();
        CoffeeTable modernCoffeeTable = ModernFactory.createCoffeeTable();
        Sofa modernSofa = ModernFactory.createSofa();

        modernChair.hasLegs();
        modernCoffeeTable.CoffeeTime();
        modernSofa.relaxOnSofa();

        System.out.println("Make a full victorian furniture");
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();
        Sofa victorianSofa = victorianFactory.createSofa();

        victorianChair.hasLegs();
        victorianCoffeeTable.CoffeeTime();
        victorianSofa.relaxOnSofa();
    }
}
