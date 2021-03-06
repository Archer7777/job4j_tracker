package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void max() {
        int first = 27;
        int second = 26;
        int result = Max.max(first, second);
        int expected = 27;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax() {
        int first = 2;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMax1() {
        int first = 1;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}