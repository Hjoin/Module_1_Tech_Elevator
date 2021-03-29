package com.techelevator;

import processing.core.PApplet;

public class MySketch extends PApplet {

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        background(210, 0, 221);
    }

    @Override
    public void draw() {
        /* circle(width / 2.0f, height / 2.0f, 200); //circle (10,10,50)
        circle(500,10,300); //circle (10,10,50)
        circle(100,400,300); //circle (10,10,50) */
        fill(random(255));
        circle(random(width),random(height),10);
        circle(mouseX,mouseY,50);
    }

}
