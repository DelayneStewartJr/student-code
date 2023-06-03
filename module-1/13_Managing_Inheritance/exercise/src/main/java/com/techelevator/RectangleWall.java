package com.techelevator;

public class RectangleWall extends Wall {
    int length;
    int height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }


    @Override
    public String toString() {
        return getName() + " " + "(" + length + "x" + height +")" + " " + "rectangle";
    }

    @Override
    public int getArea() {
        return (length*height);
    }
}
