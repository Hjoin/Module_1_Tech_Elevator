package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {

    @Test
    public void one_less_than_20() {
        Less20 sut = new Less20();

        Assert.assertTrue(sut.isLessThanMultipleOf20(18));
    }

    @Test
    public void two_less_than_20() {
        Less20 sut = new Less20();

        Assert.assertTrue(sut.isLessThanMultipleOf20(19));
    }


}
