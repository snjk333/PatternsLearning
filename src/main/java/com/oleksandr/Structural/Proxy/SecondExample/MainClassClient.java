package com.oleksandr.Structural.Proxy.SecondExample;

public class MainClassClient {
    public static void main(String[] args) {
        ServiceInterface service = new Proxy(new Service());
        service.operation();
    }
}
