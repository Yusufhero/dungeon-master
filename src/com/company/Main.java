package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(createObject("Son"));
        System.out.println(createObject("Mother"));
        System.out.println(createObject("Dady"));
    }
    public static Printable createObject(String ClassName) {
        switch (ClassName) {
            case "Daughter":
                return new Daughter("Elsa", "Bobov", "Books", 25);
            case "Mother":
                return new Mother("Francur", "Bobov", "Sleep", 48);
            case "GrandDaughter":
                return new GrandDaughter("Cum", "Bobov", "Game", 7);
            case "Dady":
                return new Daughter("Cum", "Bobov", "gg ", 47);
            case "Son":
                return new Son("Ci", "Bobov", 27);
            case "GrandSon":
                return new GrandSon("rr", "Bobov",  7);

        }
        return null;
    }
}
