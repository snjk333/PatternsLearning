package com.oleksandr.Behavioral.Visitor.Developers;

import com.oleksandr.Behavioral.Visitor.Elements.DataBase;
import com.oleksandr.Behavioral.Visitor.Elements.ProjectClass;
import com.oleksandr.Behavioral.Visitor.Elements.Test;

public interface Developer {

    public void create(ProjectClass project);
    public void create(DataBase dataBase);
    public void create(Test test);


}
