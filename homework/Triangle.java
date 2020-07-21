package com.kodilla.abstracts.homework;

import java.sql.SQLOutput;

public class Triangle extends Shape {
    public Triangle() {
        super("a * 3", "(a*h)/2");
    }

    @Override
    public void giveSurfaceArea() {
        System.out.println("Formula for a triangle area is:");

    }

    @Override
    public void giveCircut() {
        System.out.println("Forula for a triangle circut is:");

    }
}
