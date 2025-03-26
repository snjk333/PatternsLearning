package com.oleksandr.Behavioral.Visitor;

import com.oleksandr.Behavioral.Visitor.Developers.Developer;
import com.oleksandr.Behavioral.Visitor.Developers.JuniorDeveloper;
import com.oleksandr.Behavioral.Visitor.Developers.SeniorDeveloper;

public class MainClass {
    public static void main(String[] args) {

        Project p = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior Developer in Action..");
        p.beWritten(junior);
        System.out.println("\n========================\n");
        System.out.println("Senior Developer in Action..");
        p.beWritten(senior);


    }
}
