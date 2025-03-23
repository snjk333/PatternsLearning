package com.oleksandr.Behavioral.Mediator.Components;

import com.oleksandr.Behavioral.Mediator.Mediators.Mediator;

public class ComponentB implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentB";
    }

    public void operationB(String name) {
        System.out.println("Component B doing operation: " + name);
        mediator.notify(this, "Operation B completed");
    }
}
