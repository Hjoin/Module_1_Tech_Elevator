package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {

    @Test
    public void first_and_last_same() {
        SameFirstLast sut = new SameFirstLast();

        boolean nums = sut.isItTheSame(new int[] {1, 2, 3, 1});

        Assert.assertTrue(nums);

    }

    @Test
    public void first_and_last_different() {
        SameFirstLast sut = new SameFirstLast();

        boolean nums = sut.isItTheSame(new int[] {1, 5, 9});

        Assert.assertFalse(nums);
    }

}
