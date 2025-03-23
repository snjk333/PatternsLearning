package com.oleksandr.Behavioral.Mediator.Components;

import com.oleksandr.Behavioral.Mediator.Mediators.Mediator;

public class ComponentD implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ComponentA";
    }

    public void operationD(String name) {
        System.out.println("Component D doing operation: " + name);
        //mediator.notify(this, "Operation D completed");
    }
}
