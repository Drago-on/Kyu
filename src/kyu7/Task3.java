package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task3 {
    public class Vowels {

        public static int getCount(String str) {
            int vowelsCount = 0;
            String vowels = "aeiou";
            for (char letter : str.toCharArray()) {
                if (vowels.contains(String.valueOf(letter))){
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }

    }


    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}
