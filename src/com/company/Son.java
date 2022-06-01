package com.company;

public class Son extends GrandFather{
    public Son(String name, String surname, Integer age) {
        super(name, surname, age);
    }

    @Override
    public void draw() {
        System.out.println("\uD83E\uDDD1\u200D\uD83E\uDDB3");
    }

    @Override
    public void getIngo() {

    }
}
