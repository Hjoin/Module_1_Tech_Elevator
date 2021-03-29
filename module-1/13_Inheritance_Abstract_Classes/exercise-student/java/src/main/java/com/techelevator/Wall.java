package com.techelevator;

public abstract class Wall {
    private String name;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    private String color;

    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract int getArea();

}
