package com.oocl;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. I am %d years old. Coding for the glory of OOCL.", this.getName(), this.getAge());
    }
}
