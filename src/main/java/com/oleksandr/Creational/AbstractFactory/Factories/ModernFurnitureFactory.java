package com.oleksandr.Creational.AbstractFactory.Factories;

import com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects.Chair;
import com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects.ModernChair;
import com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects.CoffeeTable;
import com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects.ModernCoffeeTable;
import com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects.ModernSofa;
import com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
