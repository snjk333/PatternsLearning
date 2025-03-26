package com.oleksandr.Behavioral.Memento;

import com.sun.jdi.ThreadGroupReference;

public class MainClass {
    public static void main(String[] args) {

        Project project = new Project();

        Repository repo = new Repository();

        System.out.println("Create new project 1.0");
        project.serVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Save to repository");
        repo.setSave(project.save());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Updating to version 1.1");
        project.serVersionAndDate("1.1");
        System.out.println(project);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Return to previous project version...");
        project.load(repo.getSave());
        System.out.println(project);

    }
}
