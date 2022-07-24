package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Task4 {
    JadenCase jadenCase = new JadenCase();

    public class JadenCase {

        public String toJadenCase(String phrase) {
            if (phrase == null || phrase.isEmpty()) return null;
            char[] result = phrase.toCharArray();
            result[0] = String.valueOf(result[0]).toUpperCase().charAt(0);
            for (int i = 1; i < phrase.length(); i++) {
                if (result[i - 1] == ' '){
                    result[i] = String.valueOf(result[i]).toUpperCase().charAt(0);
                }
            }
            return new String(result);
        }

    }


    @Test
    public void test() {

        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }

}