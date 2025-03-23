package com.oleksandr.Behavioral.Mediator.Mediators;

import com.oleksandr.Behavioral.Mediator.Components.Component;

public interface Mediator {
    void notify(Component component, String message);
}
