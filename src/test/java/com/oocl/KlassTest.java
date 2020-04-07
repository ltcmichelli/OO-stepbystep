package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KlassTest {

    @Test
    public void testAssignStudentToKlass_ForQ5(){
        Student studentTom = new Student();
        studentTom.setName("Tom");

        Klass klassForTom = new Klass(2);
        klassForTom.assignStudentToKlass(studentTom);
        studentTom.setKlassForStudent(klassForTom);

        List<Student> expectedStudentList = Arrays.asList(studentTom);

        Assert.assertEquals(expectedStudentList, klassForTom.getStudentList());
        Assert.assertEquals(2, studentTom.getKlassForStudent().getKlassNum());
    }

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

    @Test
    public void testWelcomeNewJoinerFromExistingStudentsInClass_ForQ10(){
        Klass klass2 = new Klass(2);
        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setAge(18);
        studentTom.setKlassForStudent(klass2);
        klass2.assignStudentToKlass(studentTom);

        Student studentJim = new Student();
        studentJim.setName("Jim");
        studentJim.setKlassForStudent(klass2);
        klass2.assignStudentToKlass(studentJim);

        String expect = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.";
        Assert.assertEquals(expect, studentJim.getWelcomeMsg());
    }

    @Test
    public void testWelcomeClassLeaderFromExistingStudentsInClass_ForQ11(){
        Klass klass2 = new Klass(2);
        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setAge(18);
        studentTom.setKlassForStudent(klass2);
        klass2.assignStudentToKlass(studentTom);

        Student studentJim = new Student();
        studentJim.setName("Jim");
        studentJim.setKlassForStudent(klass2);
        klass2.assignKlassLeader(studentJim);

        String expect = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.";
        Assert.assertEquals(expect, studentJim.getWelcomeMsg());
    }
}
