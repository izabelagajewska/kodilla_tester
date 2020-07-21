package com.kodilla.inheritance.homework;

public class Year extends OperatingSystem {

    public void turnOn() {
        System.out.println("Turning system on...");
    }

    public Year(int yearOfIssue) {
        super(yearOfIssue);
        System.out.println("Year constructor");
    }
}

