package com.oleksandr.Structural.Adapter;

public class Adapter implements ClientInterface{

    private Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String method(Integer data) {
        String specialData = convertToServiceFormat(data);
        return adaptee.serviceMethod(specialData);
    }

    private String convertToServiceFormat(Integer data) {
        return "Converted to serviceFormat: " + Integer.toString(data);
    }
}
