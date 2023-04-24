package com.company;

public class Sparrow extends Animal implements Flyabl, Drawabl{
    @Override
    public void makeVoice() {
        System.out.println(" chik chirik ");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC26");

    }

    @Override
    public String draw3D(String material) {
        return "Vorobei izobrajen v 3D iz materiala " + material;
    }

    @Override
    public void fly() {
        System.out.println(" Vorobei poletel ");

    }
}
