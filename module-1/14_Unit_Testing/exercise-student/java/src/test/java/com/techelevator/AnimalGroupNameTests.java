package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void getHerd_returns_Tower_for_giraffe() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();

        //Act
        String herd = sut.getHerd("giraffe");

        //Assert
        Assert.assertEquals("Tower", herd);
    }

    @Test
    public void getHerd_returns_Unknown_for_unidentified_animal() {
        //Arrange
        AnimalGroupName sut = new AnimalGroupName();
        //Act
        String herd = sut.getHerd("walrus");
        //Assert
        Assert.assertEquals("unknown", herd);

    }
}
