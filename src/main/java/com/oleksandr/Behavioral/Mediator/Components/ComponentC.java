package com.oleksandr.Behavioral.Mediator.Components;

import com.oleksandr.Behavioral.Mediator.Mediators.Mediator;

public class ComponentC implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentA";
    }

    public void operationC(String name) {
        System.out.println("Component C doing operation: " + name);
        mediator.notify(this, "Operation C completed");
    }
}
