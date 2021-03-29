package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {

    @Test
    public void not_getting_a_table() {
        DateFashion sut = new DateFashion();

        int getting_table = sut.getATable(0,5);

        Assert.assertEquals(0, getting_table);

    }

    @Test
    public void for_sure_getting_table() {
        DateFashion sut = new DateFashion();

        int getting_table = sut.getATable(9,3);

        Assert.assertEquals(2, getting_table);

    }

    @Test
    public void maybe_getting_a_table() {
        DateFashion sut = new DateFashion();

        int getting_table = sut.getATable(3, 7);

        Assert.assertEquals(1,getting_table);
    }

}
