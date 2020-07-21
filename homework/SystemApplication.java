package com.kodilla.inheritance.homework;

public class SystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();

        Year year = new Year(2020);
        year.turnOff();
        System.out.println(year.getYearOfIssue());
    }
}
