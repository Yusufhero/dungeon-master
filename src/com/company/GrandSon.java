package com.company;

public class GrandSon extends GrandFather {
    public GrandSon(String name, String surname, Integer age) {
        super(name, surname, age);
    }

    @Override
    public void draw() {
        System.out.println("\uD83E\uDDD1\u200D\uD83E\uDDB1");
    }

    @Override
    public void getIngo() {

    }
}
