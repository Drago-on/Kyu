package kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeBinary {
    public static String fakeBin(String numberString) {

        String result = "";
        for (String c : numberString.split("")) {
            int number = Integer.parseInt(c);
            result += number >= 5 ? "1" : "0";
        }
        return result;
    }


    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBin("366058562030849490134388085"));
    }
}
