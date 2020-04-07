package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testIntroduce(){
        Person personTom = new Person("Tom", 21);
        String expect = "My name is Tom. I am 21 years old.";

        Assert.assertEquals(expect, personTom.introduce());
    }

}
