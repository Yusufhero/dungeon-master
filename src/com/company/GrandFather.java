package com.company;

public abstract class GrandFather implements Printable {
  protected   String name;
  protected   String Surname;
  protected   Integer age;

    public GrandFather(String name, String surname, Integer age) {
        this.name = name;
        Surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void draw() {
        System.out.println("\uD83D\uDC74");
    }

    public String getInfo() {
        return "Age: " + age +
                "\nname" + name +
                "\nsurname" + Surname;
    }
}
