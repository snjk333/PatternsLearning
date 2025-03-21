package com.oleksandr.Structural.Bridge.AbstractionSide;

import com.oleksandr.Structural.Bridge.ImplementationSide.Color;

public class Cube extends Figure{

    public Cube(Color color) {
        super(color);
    }

    @Override
    public void figureMethod() {
        super.figureMethod();
        System.out.println("I'm not a figure already. I'm cube.");
    }

    public void drawCube() {
        System.out.println("Hello, i'm a cube :)");
    }
}
