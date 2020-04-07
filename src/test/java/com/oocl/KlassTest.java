package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class KlassTest {

    @Test
    public void testNumOfClassLeader_givenStudentInThatClass_ForQ6(){
        Student studentA = new Student();
        studentA.setName("A");

        Teacher teacherWoody = new Teacher();
        Klass klass2 = new Klass(2);
        klass2.setKlassTeacher(teacherWoody);
        studentA.setKlassForStudent(klass2);

        klass2.assignKlassLeader(studentA);

        Assert.assertEquals("A", klass2.getKlassLeader().getName());
    }

    @Test
    public void testWelcomeMsgOfNewJoiner_ForQ8(){
        Klass klass2 = new Klass(2);
        Teacher teacherWoody = new Teacher();
        teacherWoody.setName("Woody");
        teacherWoody.setAge(30);
        teacherWoody.assignKlass(klass2);

        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setKlassForStudent(klass2);

        klass2.setKlassTeacher(teacherWoody);
        klass2.assignStudentToKlass(studentTom);

        String expect = "My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.";

        Assert.assertEquals(expect, teacherWoody.getWelcomeMsg());
    }

    @Test
    public void testWelcomeMsgOfClassLeader_ForQ9(){
        Klass klass2 = new Klass(2);
        Teacher teacherWoody = new Teacher();
        teacherWoody.setName("Woody");
        teacherWoody.setAge(30);
        teacherWoody.assignKlass(klass2);

        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setKlassForStudent(klass2);

        klass2.setKlassTeacher(teacherWoody);
        klass2.assignKlassLeader(studentTom);

        String expect = "My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.";
        Assert.assertEquals(expect, teacherWoody.getWelcomeMsg());
    }
}
