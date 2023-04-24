package com.company;

public class Car extends Transport{
    @Override
    public void drawWithColor() {
        System.out.println("\u001B[34m" +"Mashina" + "\u001B[34m");

    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE97");

    }

    @Override
    public String draw3D(String material) {
        return "Car izobrajen v 3D iz materiala " + material;
    }
}
