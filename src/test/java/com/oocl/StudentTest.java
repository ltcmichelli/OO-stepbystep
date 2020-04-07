package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StudentTest {
    @Test
    public void testIntroduceForQ2(){
        Student studentTom = new Student("Tom", 18);
        String expect = "My name is Tom. I am 18 years old. Coding for the glory of OOCL.";

        Assert.assertEquals(expect, studentTom.introduce());
    }

    @Test
    public void testIntroduceForQ4(){
        Student studentTom = new Student("Tom", 18);
        Klass klassForTom = new Klass(2);
        studentTom.setKlassForStudent(klassForTom);
        String expect = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.";

        Assert.assertEquals(expect, studentTom.introduceWithClass());
    }

    @Test
    public void testIntroduceForQ5(){
        Student studentTom = new Student("Tom", 18);
        Klass klassForTom = new Klass(2);
        klassForTom.assignStudentToKlass(studentTom);

        studentTom.setKlassForStudent(klassForTom);
        List<Student> expectedStudentList = Arrays.asList(studentTom);

        Assert.assertEquals(expectedStudentList, klassForTom.getStudentList());
        Assert.assertEquals(2, studentTom.getKlassForStudent().getKlassNum());
    }
}
