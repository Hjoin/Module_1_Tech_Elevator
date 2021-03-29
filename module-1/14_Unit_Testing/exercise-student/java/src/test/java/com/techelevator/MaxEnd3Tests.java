package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {

    @Test
    public void return_max_last_number() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int[] {1, 5, 7});
        Assert.assertArrayEquals(new int[]{7,7,7}, nums);
    }

    @Test
    public void return_max_first_number() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int[] {8, 1, 7});
        Assert.assertArrayEquals(new int[]{8,8,8}, nums);
    }

    @Test
    public void return_max_number_with_max_middle_number() {
        MaxEnd3 sut = new MaxEnd3();
        int[] nums = sut.makeArray(new int[] {8, 11, 7});
        Assert.assertArrayEquals(new int[]{8,8,8}, nums);
    }
}
