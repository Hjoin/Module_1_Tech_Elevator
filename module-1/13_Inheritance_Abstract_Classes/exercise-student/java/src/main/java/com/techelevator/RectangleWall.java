package com.techelevator;

public class RectangleWall extends Wall {
    private int length;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    private int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " (" + getLength() + "x" + getHeight() + ") rectangle";
    }


    @Override
    public int getArea() {
        return length * height;
    }
}