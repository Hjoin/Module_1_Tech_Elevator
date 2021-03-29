package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

    @Test
    public void weekday_squirrel_party() {
        CigarParty sut = new CigarParty();

        Assert.assertTrue(sut.haveParty(60, false));

    }

    @Test
    public void weekend_squirrel_party() {
        CigarParty sut = new CigarParty();

        Assert.assertTrue(sut.haveParty(70, true));

    }

}
