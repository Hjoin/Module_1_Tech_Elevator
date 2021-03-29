package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {

    @Test
    public void getCount_words() {
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[] {"ba", "ba", "black", "sheep"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);
        Assert.assertEquals(expected, words);
    }

    @Test
    public void getCount_words_two() {
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[] {""});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("", 1);
        Assert.assertEquals(expected, words);
    }

    @Test
    public void getCount_words_three() {
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{"a", "b", "a", "c", "b"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        Assert.assertEquals(expected, words);
    }
        @Test
        public void getCount_words_four() {
            WordCount sut = new WordCount();
            Map<String, Integer> words = sut.getCount(new String[] {"c", "b", "a"});
            Map<String, Integer> expected = new HashMap<>();
            expected.put("a", 1);
            expected.put("b", 1);
            expected.put("c", 1);
            Assert.assertEquals(expected, words);
    }
}
