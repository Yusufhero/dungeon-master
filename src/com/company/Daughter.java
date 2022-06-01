package com.company;

public class Daughter extends GrandMother{


    public Daughter(String name, String surname, String hobby, Integer age) {
        super(name, surname, hobby, age);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC69\u200D\uD83E\uDDB3");
    }

    @Override
    public void getIngo() {

    }
}
