package com.knoldus;

public class Person {
    private String name;
    private int personAge;

    public Person(String name, int personAge) {
        this.name = name;
        this.personAge = personAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return personAge;
    }

    public void setAge(int age) {
        this.personAge = age;
    }
    public boolean isAdult() {
        return personAge >= 18;
    }

}
