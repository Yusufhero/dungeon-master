package com.company;

public abstract class GrandMother implements Printable {
   protected String name;
   protected String surname;
   protected String hobby;
   protected Integer age;

    public GrandMother(String name, String surname, String hobby, Integer age) {
        this.name = name;
        this.surname = surname;
        this.hobby = hobby;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void draw() {
        System.out.println("\uD83D\uDC75");
    }
    public String getInfo() {
        return "Age: " + age +
                "\nname" + name +
                "\nsurname" + surname +
                "\nHobby" + hobby;
    }
}
