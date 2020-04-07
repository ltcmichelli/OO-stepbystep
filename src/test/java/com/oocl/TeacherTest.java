package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TeacherTest {
    @Test
    public void testIntroduceofTeacher_shouldReturnIntroduceMsg_ForQ3(){
        Teacher teacherWoody = new Teacher();
        teacherWoody.setName("Woody");
        teacherWoody.setAge(30);
        String expect = "My name is Woody. I am 30 years old. Teaching for the future of world.";

        Assert.assertEquals(expect, teacherWoody.introduce());
    }

    @Test
    public void testAssignKlass_givenTeacherTakeLessThanFiveClass_ForQ7(){
        Teacher teacherWoody = new Teacher();
        teacherWoody.setName("Woody");
        teacherWoody.setAge(30);
        Klass klassForWoody = new Klass(2);
        teacherWoody.assignKlass(klassForWoody);

        Assert.assertEquals(1, teacherWoody.getKlassList().size());
    }

    @Test
    public void testAssignKlass_givenTeacherTakeMoreThanFiveClass_ForQ7(){
        Teacher teacherWoody = new Teacher();
        teacherWoody.setName("Woody");
        teacherWoody.setAge(30);
        Klass extraKlass = new Klass(6);
        teacherWoody.setKlassList(Arrays.asList(new Klass(1),
                new Klass(2),
                new Klass(3),
                new Klass(4),
                new Klass(5)));
        teacherWoody.assignKlass(extraKlass);

        Assert.assertEquals(5, teacherWoody.getKlassList().size());
    }
}
