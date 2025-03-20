package com.oleksandr.Creational.AbstractFactory.Factories;

import com.oleksandr.Creational.AbstractFactory.Objects.ChairObjects.Chair;
import com.oleksandr.Creational.AbstractFactory.Objects.CoffeeTableObjects.CoffeeTable;
import com.oleksandr.Creational.AbstractFactory.Objects.SofaObjects.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
