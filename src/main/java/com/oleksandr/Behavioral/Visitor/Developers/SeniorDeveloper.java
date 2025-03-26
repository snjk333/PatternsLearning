package com.oleksandr.Behavioral.Visitor.Developers;

import com.oleksandr.Behavioral.Visitor.Elements.DataBase;
import com.oleksandr.Behavioral.Visitor.Elements.ProjectClass;
import com.oleksandr.Behavioral.Visitor.Elements.Test;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass project) {
        System.out.println("ProjectClass: Rewriting after junior..");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("DataBase: Rewriting after junior..");
    }

    @Override
    public void create(Test test) {
        System.out.println("Test: Rewriting after junior..");
    }
}
