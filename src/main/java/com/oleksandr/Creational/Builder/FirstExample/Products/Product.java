package com.oleksandr.Creational.Builder.FirstExample.Products;

public abstract class Product {

    private String partA;
    private String partB;
    private String partD;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartD() {
        return partD;
    }

    public void setPartD(String partD) {
        this.partD = partD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partD='" + partD + '\'' +
                '}';
    }
}
