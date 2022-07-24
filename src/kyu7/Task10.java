package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task10 {
    public class Positive {
        public static int sum(int[] arr) {
            int sum = 0;
            for (int i : arr) {
                if (i >= 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
    }
}
