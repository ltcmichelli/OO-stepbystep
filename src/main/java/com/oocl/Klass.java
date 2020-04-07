package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Klass {
    public int klassNum;
    public List<Student> studentList = new ArrayList<Student>();

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
    }
}
