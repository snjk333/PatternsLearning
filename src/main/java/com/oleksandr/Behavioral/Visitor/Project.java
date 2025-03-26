package com.oleksandr.Behavioral.Visitor;

import com.oleksandr.Behavioral.Visitor.Developers.Developer;
import com.oleksandr.Behavioral.Visitor.Elements.DataBase;
import com.oleksandr.Behavioral.Visitor.Elements.ProjectClass;
import com.oleksandr.Behavioral.Visitor.Elements.ProjectElement;
import com.oleksandr.Behavioral.Visitor.Elements.Test;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectElement {

    List<ProjectElement> elements;


    public Project() {
        elements = new ArrayList<>();
        elements.add(new ProjectClass());
        elements.add(new DataBase());
        elements.add(new Test());
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement element : elements){
            element.beWritten(developer);
        }
    }
}
