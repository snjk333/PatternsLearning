package com.oleksandr.Creational.Singleton.BasicRealization;

public class MainClass {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1 == s2){
            System.out.println("s1 and s2 have same address");
        }
    }
}
