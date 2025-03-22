package com.oleksandr.Creational.Builder.SecondExample;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .withFirstName("Jon")
                .withLastName("Doe")
                .build();
        System.out.println(p1);
        // Jon Doe null 0

        Person p2 = Person.builder()
                .withAge(25)
                .withFirstName("Max")
                .withLastName("Kowalski")
                .withJobTitle("Admin")
                .build();
        System.out.println(p2);
        // Max Kowalski Admin 25
    }
}
