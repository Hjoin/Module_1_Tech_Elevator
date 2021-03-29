package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void concatenation() {
        NonStart sut = new NonStart();
        String fused = sut.getPartialString("ano", "ego");

        Assert.assertEquals("nogo",fused);
    }

    @Test
    public void concatenation_without_B() {
        NonStart sut = new NonStart();
        String fused = sut.getPartialString("ab", "");

        Assert.assertEquals("b",fused);
    }

    @Test
    public void concatenation_without_A() {
        NonStart sut = new NonStart();
        String fused = sut.getPartialString("", "et");

        Assert.assertEquals("t",fused);
    }

    @Test
    public void concatenation_two() {
        NonStart sut = new NonStart();
        String fused = sut.getPartialString("shotl", "java");

        Assert.assertEquals("hotlava",fused);
    }

}
