package com.oocl;

public class Student extends Person {
    public Klass klassForStudent;
    public String welcomeMsg;

    public Student() {
        super();
    }

    public Klass getKlassForStudent() {
        return klassForStudent;
    }

    public void setKlassForStudent(Klass klassForStudent) {
        this.klassForStudent = klassForStudent;
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. I am %d years old. Coding for the glory of OOCL.", this.getName(), this.getAge());
    }

    public String introduceWithClass(){
        return String.format("My name is %s. I am %d years old. I am a student of class %d. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getKlassForStudent().getKlassNum());
    }

    public String getNewJoinerMsg(){
        return String.format(" Welcome %s join Class %d.", this.getName(), this.getKlassForStudent().getKlassNum());
    }

    public String getClassLeaderMsg(){
        return String.format(" %s is the leader of Class %d.", this.getName(), this.getKlassForStudent().getKlassNum());
    }

    public String welcome(String welcomeMsg) {
        return this.introduceWithClass() + welcomeMsg;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}
