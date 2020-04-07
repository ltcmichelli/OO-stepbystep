package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void testIntroduce(){
        Teacher teacherWoody = new Teacher("Woody", 30);
        String expect = "My name is Woody. I am 30 years old. Teaching for the future of world.";

        Assert.assertEquals(expect, teacherWoody.introduce());
    }
}
