package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when000to978then11point40() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(9, 7, 10);
        double dist = a.distance(b);
        double expected = 11.40;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to869then13point45() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(8, 6, 9);
        double dist = a.distance3d(b);
        double expected = 13.45;
        Assert.assertEquals(expected, dist, 0.01);
    }
}