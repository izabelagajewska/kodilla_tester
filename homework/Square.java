package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super("4 * a", "a * a");
    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Formula for a square area is:");
    }

    @Override
    public void giveCircut() {
        System.out.println("Forula for a square circut is:");
    }
}
