package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testIntroduceOfStudent_shouldReturnIntroduceMsg_ForQ2(){
        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setAge(18);

        String expect = "My name is Tom. I am 18 years old. Coding for the glory of OOCL.";

        Assert.assertEquals(expect, studentTom.introduce());
    }

    @Test
    public void testIntroduceOfStudentWithClass_shouldReturnIntroduceMsg_ForQ4(){
        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setAge(18);

        Klass klassForTom = new Klass(2);
        studentTom.setKlassForStudent(klassForTom);

        String expect = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.";
        Assert.assertEquals(expect, studentTom.introduceWithClass());
    }
}
