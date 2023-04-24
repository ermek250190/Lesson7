package com.company;

public class Snake extends Reptile{


    @Override
    public void makeVoice() {
        System.out.println(" cccccccc ");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC0D");
    }

    @Override
    public String draw3D(String material) {
        return "Zmeya izobrajen v 3D iz materiala " + material;
    }
}
