package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    public List<Klass> klassListForTeacher = new ArrayList<Klass>();
    public String welcomeMsg;

    public Teacher() {
        super();
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. Teaching for the future of world.", this.getName(), this.getAge());
    }

    public List<Klass> getKlassList() {
        return klassListForTeacher;
    }

    public void setKlassList(List<Klass> klassList) {
        this.klassListForTeacher = klassList;
    }

    public void assignKlass(Klass klass) {
        if (this.klassListForTeacher.size() < 5) {
            this.klassListForTeacher.add(klass);
        }
    }

    public String getWelcomeMsg(){
        return welcomeMsg;
    }

    public void setWelcomeMsg(String msg){
        this.welcomeMsg = introduce() + msg;
    }
}
