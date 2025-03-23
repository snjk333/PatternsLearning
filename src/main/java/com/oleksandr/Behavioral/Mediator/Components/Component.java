package com.oleksandr.Behavioral.Mediator.Components;

import com.oleksandr.Behavioral.Mediator.Mediators.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
