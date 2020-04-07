package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    public int klassNum;
    public List<Student> studentList = new ArrayList<Student>();

    public Student klassLeader;
    public Teacher klassTeacher;

    public Klass(int klassNum) {
        this.klassNum = klassNum;
    }

    public int getKlassNum() {
        return klassNum;
    }

    public void setKlassNum(int klassNum) {
        this.klassNum = klassNum;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void assignStudentToKlass(Student student){
        studentList.add(student);
        if (klassTeacher != null){
            klassTeacher.setWelcomeMsg(student.getWelcomeMsg());
        }
    }

    public Student getKlassLeader() {
        return klassLeader;
    }

    public void setKlassLeader(Student klassLeader) {
        this.klassLeader = klassLeader;
    }

    public void assignKlassLeader(Student klassLeader) {
        if (klassLeader.getKlassForStudent().getKlassNum() == klassNum){
            setKlassLeader(klassLeader);
            if (klassTeacher != null){
                klassTeacher.setWelcomeMsg(klassLeader.getClassLeaderMsg());
            }
        }
    }

    public Teacher getKlassTeacher() {
        return klassTeacher;
    }

    public void setKlassTeacher(Teacher klassTeacher) {
        this.klassTeacher = klassTeacher;
    }
}
