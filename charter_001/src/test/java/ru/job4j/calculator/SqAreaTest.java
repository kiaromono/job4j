package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        double expected = 1;
        double result = SqArea.square(4,1);
        Assert.assertEquals(expected, result, 0.01);
    }
/*
    @Test
    public void square() {
        double expected = 2;
        double result = SqArea.square(6,2);
        Assert.assertEquals(expected, result, 0.01);
    }*/
}