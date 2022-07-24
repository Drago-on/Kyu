package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task2 {
    public static class Kata {

        public static int makeNegative(final int x) {
            return x < 0 ? x : -x;
        }

    }

    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
