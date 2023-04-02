package com.knoldus;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Salil", 23);
        System.out.println(person.getName() + " is an adult: " + person.isAdult());

    }
}