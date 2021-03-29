package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

    @Test
    public void every_other_character() {
        StringBits sut = new StringBits();
        String basic = sut.getBits("Hello");
        Assert.assertEquals("Hlo", basic);

    }

    @Test
    public void every_other_character_two() {
        StringBits sut = new StringBits();
        String basic = sut.getBits("Hi");
        Assert.assertEquals("H", basic);

    }
    @Test
    public void every_other_character_three() {
        StringBits sut = new StringBits();
        String basic = sut.getBits("Heeololeo");
        Assert.assertEquals("Hello", basic);

    }

    @Test
    public void every_other_character_four() {
        StringBits sut = new StringBits();
        String basic = sut.getBits("");
        Assert.assertEquals("", basic);

    }
}
