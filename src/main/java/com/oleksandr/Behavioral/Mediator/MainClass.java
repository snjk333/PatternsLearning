package com.oleksandr.Behavioral.Mediator;

import com.oleksandr.Behavioral.Mediator.Components.ComponentA;
import com.oleksandr.Behavioral.Mediator.Components.ComponentB;
import com.oleksandr.Behavioral.Mediator.Components.ComponentC;
import com.oleksandr.Behavioral.Mediator.Components.ComponentD;
import com.oleksandr.Behavioral.Mediator.Mediators.ConcreteMediator;

public class MainClass {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();
        ComponentC componentC = new ComponentC();
        ComponentD componentD = new ComponentD();

        componentA.setMediator(mediator);
        componentB.setMediator(mediator);
        componentC.setMediator(mediator);
        componentD.setMediator(mediator);

        mediator.setComponentA(componentA);
        mediator.setComponentB(componentB);
        mediator.setComponentC(componentC);
        mediator.setComponentD(componentD);

        componentA.operationA("Main Trigger");
    }
}
