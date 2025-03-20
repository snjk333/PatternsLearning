package com.oleksandr.Creational.AbstractFactory.Factories;

import com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects.Chair;
import com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects.VictorianChair;
import com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects.CoffeeTable;
import com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects.VictorianCoffeeTable;
import com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects.Sofa;
import com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
