package ru;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeiht() {
        //double height = 100 *1.15;
        double expected = 92;
        double out = fit.manWeight(expected);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeiht() {
        //double height = 110 * 1.15;
        double expected = 80.5;
        double out = fit.womanWeight(expected);
        Assert.assertEquals(expected, out, 0.01);
    }
}
