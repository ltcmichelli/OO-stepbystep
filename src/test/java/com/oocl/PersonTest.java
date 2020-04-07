package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testIntroduceOfPerson_shouldReturnIntroduceMsg_ForQ1(){
        Person personTom = new Person();
        personTom.setName("Tom");
        personTom.setAge(21);
        String expect = "My name is Tom. I am 21 years old.";

        Assert.assertEquals(expect, personTom.introduce());
    }

}
