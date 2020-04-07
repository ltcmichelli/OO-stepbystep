package com.oocl;

public class Person {
    public String name;
    public int age;

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", this.getName(), this.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
