package ru;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {

    @Test
    public void distanse() {
        double expected = 2.0;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);

    }
}
