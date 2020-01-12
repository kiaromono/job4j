package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
        public void WhenForthMax() {
            int result = SqMax.max(1, 4, 2,6);
            assertThat(result, is(6));
        }
    @Test
    public void WhenFirsthMax() {
        int result = SqMax.max(7, 4, 2,8);
        assertThat(result, is(8));
    }
    @Test
    public void WhenSecondhMax() {
        int result = SqMax.max(6, 9, 2,8);
        assertThat(result, is(9));
    }
    @Test
    public void WhenThirdMax() {
        int result = SqMax.max(1, 4, 5,7);
        assertThat(result, is(7));
    }
    @Test
    public void WhenEq() {
        int result = SqMax.max(6, 6, 6,6);
        assertThat(result, is(6));
    }
    }
