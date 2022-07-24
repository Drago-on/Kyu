package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task9 {
    public class Upper {
        public static String MakeUpperCase(String str){
            return str.toUpperCase();
        }
    }

    @Test
    public void testSomething() {
        Upper u = new Upper();
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
