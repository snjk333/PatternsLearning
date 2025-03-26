package com.oleksandr.Behavioral.Visitor.Elements;

import com.oleksandr.Behavioral.Visitor.Developers.Developer;

public class Test implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
