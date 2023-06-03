package com.techelevator;

public class SquareWall extends RectangleWall{




    @Override
    public String toString() {
        return getName() +  " " + "(" + getHeight()  + "x" + getHeight() + ")" + " " + "square";
    }

    public SquareWall(String name, String color,int sideLength ) {
        super(name, color, sideLength, sideLength );

    }
}

