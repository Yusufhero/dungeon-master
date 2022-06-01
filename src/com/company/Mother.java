package com.company;

public class Mother extends GrandMother {


    public Mother(String name, String surname, String hobby, Integer age) {
        super(name, surname, hobby, age);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC71\u200D♀️");
    }

    @Override
    public void getIngo() {

    }
}
