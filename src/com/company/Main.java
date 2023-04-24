package com.company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal() {
            @Override
            public void draw() {
                System.out.println("\uD83D\uDE3A");
            }

            @Override
            public String draw3D(String material) {
                return "Cat izobrajen v 3D iz materiala " + material;

            }

            @Override
            public void makeVoice() {
                System.out.println("miauuu");
            }
        };
        cat.makeVoice();
        cat.draw();
        System.out.println("____________________________________");

       Drawabl dog = new Dog();
       Drawabl [] drawabls = {cat, dog, new Car(), new Sparrow(), new Snake(), new Plane()};
        for (int i = 0; i < drawabls.length; i++) {
          drawAll(drawabls[i]);
          if (drawabls[i] instanceof Animal){
              ((Animal)drawabls[i]).makeVoice();
          }
          if (drawabls[i] instanceof Flyabl){
              ((Flyabl) drawabls[i]).fly();
          }

        }
    }
    public static void drawAll(Drawabl d){
        d.draw();

        System.out.println(d.draw3D(" plastic "));

        if (d instanceof ColorDrawabl){
            ((ColorDrawabl) d).drawWithColor();
        }
    }

}
