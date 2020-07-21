package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super("2*a + 2*b", "a * b");
    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Formula for a rectangle area is:");

    }

    @Override
    public void giveCircut() {
        System.out.println("Forula for a rectangle circut is:");

    }
}
