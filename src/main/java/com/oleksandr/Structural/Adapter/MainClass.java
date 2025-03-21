package com.oleksandr.Structural.Adapter;

public class MainClass {
    public static void main(String[] args) {
        String clientData = "I'm a client data.";
        Service service = new Service();
        Adapter adapter = new Adapter(service);

        String clientNewData = adapter.method(clientData);
        System.out.println(clientNewData);
    }
}
