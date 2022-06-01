package com.company;

public class Dady extends GrandFather {

    public Dady(String name, String surname, Integer age) {
        super(name, surname, age);
    }


    @Override
    public void draw() {
        System.out.println("\uD83D\uDC71\u200D♂️");
    }

    @Override
    public void getIngo() {

    }
}
