package com.oocl;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. I am %d years old. Teaching for the future of world.", this.getName(), this.getAge());
    }
}
