package com.company;

public class Plane extends Transport implements Flyabl{
    @Override
    public void draw() {
        System.out.println("✈");
    }

    @Override
    public String draw3D(String material) {
        return "plane izobrajen v 3D iz materiala " + material;
    }

    @Override
    public void fly() {
        System.out.println("Samalet vzletel visoko na nebo");
    }

    @Override
    public void drawWithColor() {
        System.out.println("\u001B[34m" +" Plane " + "\u001B[34m");

    }
}
