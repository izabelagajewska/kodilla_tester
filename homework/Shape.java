package com.kodilla.abstracts.homework;

public abstract class Shape {

    private String circut;
    private String surfaceArea;

    public Shape(String circut, String surfaceArea) {
        this.circut = circut;
        this.surfaceArea = surfaceArea;
    }

    public String getCircut() {
        return circut;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public abstract void giveSurfaceArea();

    public abstract void giveCircut();
}
