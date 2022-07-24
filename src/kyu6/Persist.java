package kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Persist {
    public static int persistence(long n) {
        int counter = 0;
        long temp = n;

        while (temp >= 9) {
            String str = String.valueOf(temp);
            String[] strArray = str.split("");
            long res = 1;
            for (String s : strArray) {
                res *= Integer.parseInt(s);
            }
            temp = res;
            counter++;
        }
        return counter;
    }

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }
}
