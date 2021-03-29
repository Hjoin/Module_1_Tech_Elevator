package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    @Test
    public void no_1_or_3() {
        Lucky13 sut = new Lucky13();

        int[] nums = new int[] {5, 9, 7};
        boolean noOneOrThree = sut.getLucky(nums);
        Assert.assertTrue(noOneOrThree);

        }

    @Test
    public void is_1_or_3() {
        Lucky13 sut = new Lucky13();

        int[] nums = new int[] {1, 2, 3};

        boolean isOneOrThree = sut.getLucky(nums);

        Assert.assertFalse(isOneOrThree);

    }

    @Test
    public void is_one() {
        Lucky13 sut = new Lucky13();

        int[] nums = new int[] {1, 2, 5};

        boolean isOneOrThree = sut.getLucky(nums);

        Assert.assertFalse(isOneOrThree);

    }

    @Test
    public void is_three() {
        Lucky13 sut = new Lucky13();

        int[] nums = new int[] {3, 2, 5};

        boolean isOneOrThree = sut.getLucky(nums);

        Assert.assertFalse(isOneOrThree);

    }
}


