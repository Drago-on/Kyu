package kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int north = countSymbols(walk, 'n');
        int south = countSymbols(walk, 's');
        int east = countSymbols(walk, 'e');
        int west = countSymbols(walk, 'w');

        return north == south && east == west;
    }

    public static int countSymbols(char[] array, char s) {
        int counter = 0;
        for (char ch : array) {
            if (ch == s) counter++;
        }
        return counter;
    }

    @Test
    public void Test() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
