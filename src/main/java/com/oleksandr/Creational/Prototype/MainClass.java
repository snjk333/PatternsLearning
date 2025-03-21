package com.oleksandr.Creational.Prototype;

public class MainClass {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("TestFirstClone");

        ConcretePrototype cloned = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        SecondConcretePrototype originalSecond = new SecondConcretePrototype("TestFirstClone", "TestSecondClone");

        SecondConcretePrototype clonedSecond = originalSecond.clone();

        System.out.println("Original Second: " + originalSecond);
        System.out.println("Cloned Second: " + clonedSecond);
    }
}
