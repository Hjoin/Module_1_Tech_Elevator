package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    @Test
    public void length_greater_than_three_string(){
        FrontTimes sut = new FrontTimes();
        String holder = sut.generateString("Chocolate", 5);

        Assert.assertEquals("ChoChoChoChoCho", holder);
    }

    @Test
    public void length_less_than_three_string(){
        FrontTimes sut = new FrontTimes();
        String holder = sut.generateString("Na", 7);

        Assert.assertEquals("NaNaNaNaNaNaNa", holder);
    }

    @Test
    public void zero_length_string(){
        FrontTimes sut = new FrontTimes();
        String holder = sut.generateString("", 9);

        Assert.assertEquals("", holder);
    }

}
