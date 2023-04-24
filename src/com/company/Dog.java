package com.company;

public class Dog extends Animal{




    @Override
    public void makeVoice() {
        System.out.println(" gav gav ");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");

    }

    @Override
    public String draw3D(String material) {
        return "Dog izobrajen v 3D iz materiala " + material;
    }


//
//    @Override
//    public String draw3D(String material) {
////        return  System.out.println("");
//
////    }
}
