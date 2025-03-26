package com.oleksandr.Behavioral.Visitor.Developers;

import com.oleksandr.Behavioral.Visitor.Elements.DataBase;
import com.oleksandr.Behavioral.Visitor.Elements.ProjectClass;
import com.oleksandr.Behavioral.Visitor.Elements.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass project) {
        System.out.println("ProjectClass: Writing not bad code");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("DataBase: Writing not bad code");
    }

    @Override
    public void create(Test test) {
        System.out.println("Test: Writing not bad code");
    }
}
