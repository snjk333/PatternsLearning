package com.oleksandr.Structural.Bridge.AbstractionSide;

import com.oleksandr.Structural.Bridge.ImplementationSide.Color;

public class Figure {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void figureMethod(){
        System.out.println("I'm basic figure, but i can paint");
        color.printColor();
    }

}
