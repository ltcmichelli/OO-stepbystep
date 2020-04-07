package com.oocl;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", this.getName(), this.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
