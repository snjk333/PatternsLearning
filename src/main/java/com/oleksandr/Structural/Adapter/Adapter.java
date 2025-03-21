package com.oleksandr.Structural.Adapter;

public class Adapter implements ClientInterface{

    private Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String method(String data) {
        String specialData = convertToServiceFormat(data);
        return adaptee.serviceMethod(specialData);
    }

    private String convertToServiceFormat(String data) {
        return "Converted to serviceFormat: " + data;
    }
}
