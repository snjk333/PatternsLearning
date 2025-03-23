package com.oleksandr.Behavioral.Mediator.Mediators;

import com.oleksandr.Behavioral.Mediator.Components.*;

public class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;
    private ComponentD componentD;

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }

    public void setComponentC(ComponentC componentC) {
        this.componentC = componentC;
    }

    public void setComponentD(ComponentD componentD) {
        this.componentD = componentD;
    }

    @Override
    public void notify(Component component, String message) {
        System.out.println("Mediator received message: " + message + " from " + component.getName());

        if (component instanceof ComponentA) {
            reactOnA0();
        } else if (component instanceof ComponentB) {
            reactOnB0();
        } else if (component instanceof ComponentC) {
            reactOnC0();
        } else if (component instanceof ComponentD) {
            reactOnD0();
        }
    }

    private void reactOnA0() {
        System.out.println("Mediator reacting to ComponentA.");
        componentB.operationB("Triggered by A");
    }

    private void reactOnB0() {
        System.out.println("Mediator reacting to ComponentB.");
        componentC.operationC("Triggered by B");
    }

    private void reactOnC0() {
        System.out.println("Mediator reacting to ComponentC.");
        componentD.operationD("Triggered by C");
    }

    private void reactOnD0() {
        System.out.println("Mediator reacting to ComponentD.");
        componentA.operationA("Triggered by D");
    }
}
