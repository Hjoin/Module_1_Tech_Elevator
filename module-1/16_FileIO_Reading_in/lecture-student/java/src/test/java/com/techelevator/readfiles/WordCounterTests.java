package com.techelevator.readfiles;

import org.junit.Assert;
import org.junit.Test;

public class WordCounterTests {

    @Test
    public void words_in_a_line_obvious() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("this is a test");

        Assert.assertEquals(4, count);
    }

    @Test
    public void words_in_a_line_empty() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("");

        Assert.assertEquals(0, count);
    }

    @Test
    public void words_in_a_line_space_at_beginning() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("   this is a test");

        Assert.assertEquals(4, count);
    }

    @Test
    public void words_in_a_line_space_at_end() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("this is a test    ");

        Assert.assertEquals(4, count);
    }

    @Test
    public void words_in_a_line_space_in_middle() {
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("this   is    a   test");

        Assert.assertEquals(4, count);
    }
}
