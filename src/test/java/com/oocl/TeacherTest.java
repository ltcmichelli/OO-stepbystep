package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TeacherTest {
    @Test
    public void testIntroduceForQ3(){
        Teacher teacherWoody = new Teacher("Woody", 30);
        String expect = "My name is Woody. I am 30 years old. Teaching for the future of world.";

        Assert.assertEquals(expect, teacherWoody.introduce());
    }

    @Test
    public void testSetKlassList_givenTeacherTakeLessThanFiveClass_ForQ7(){
        Teacher teacherWoody = new Teacher("Woody", 30);
        Klass klassForWoody = new Klass(2);
        teacherWoody.assignKlass(klassForWoody);

        Assert.assertEquals(1, teacherWoody.getKlassList().size());
    }

    @Test
    public void testSetKlassList_givenTeacherTakeMoreThanFiveClass_ForQ7(){
        Teacher teacherWoody = new Teacher("Woody", 30);
        Klass extraKlass = new Klass(6);
        teacherWoody.setKlassList(Arrays.asList(new Klass(1),
                new Klass(2),
                new Klass(3),
                new Klass(4),
                new Klass(5)));
        teacherWoody.assignKlass(extraKlass);

        Assert.assertEquals(5, teacherWoody.getKlassList().size());
    }

    @Test
    public void testWelcomeMsgOfNewJoiner_ForQ8(){
        Klass klass2 = new Klass(2);
        Teacher teacherWoody = new Teacher("Woody", 30);
        Student studentTom = new Student("Tom", 18);
        studentTom.setKlassForStudent(klass2);

        String expect = "My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.";

        Assert.assertEquals(expect, teacherWoody.getWelcomeMsg(studentTom));
    }
}
