package com.oleksandr.Structural.Proxy.SecondExample;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("Service operation with business logic ...");
    }
}
