package com.oleksandr.Behavioral.Mediator.Components;

import com.oleksandr.Behavioral.Mediator.Mediators.Mediator;

public class ComponentA implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentA";
    }

    public void operationA(String name) {
        System.out.println("Component A doing operation: " + name);
        mediator.notify(this, "Operation A completed");
    }
}
