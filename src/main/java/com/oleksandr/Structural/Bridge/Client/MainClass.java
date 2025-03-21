package com.oleksandr.Structural.Bridge.Client;

import com.oleksandr.Structural.Bridge.AbstractionSide.Cube;
import com.oleksandr.Structural.Bridge.AbstractionSide.Figure;
import com.oleksandr.Structural.Bridge.ImplementationSide.BlueColor;
import com.oleksandr.Structural.Bridge.ImplementationSide.RedColor;

public class MainClass {

    public static void main(String[] args) {
        //client have a connection only with Abstraction Side.

        Figure figure = new Figure(new BlueColor());
        figure.figureMethod();

        Cube cube = new Cube(new RedColor());
        cube.figureMethod();
        cube.drawCube();
    }
}
