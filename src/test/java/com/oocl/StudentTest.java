package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testIntroduce(){
        Student studentTom = new Student("Tom", 18);
        String expect = "My name is Tom. I am 18 years old. Coding for the glory of OOCL.";

        Assert.assertEquals(expect, studentTom.introduce());
    }
}
