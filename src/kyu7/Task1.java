package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1 {

    public class Conversion {

        class Result {
            int a;
            String b;

            public Result(int a, String b) {
                this.a = a;
                this.b = b;
            }
        }

        public String solution(int n) {
            StringBuilder result = new StringBuilder();
            int tmp = n;
            while (tmp > 0){
                Result x = getNumber(tmp);
                result.append(x.b);
                tmp -= x.a;
            }
            return result.toString();
        }

        public Result getNumber(int n) {
            if (n >= 1000) return new Result(1000, "M");
            if (n >= 900) return new Result(900, "CM");
            if (n >= 500) return new Result(500, "D");
            if (n >= 400) return new Result(400, "CD");
            if (n >= 100) return new Result(100, "C");
            if (n >= 90) return new Result(90, "XC");
            if (n >= 50) return new Result(50, "L");
            if (n >= 40) return new Result(40, "XL");
            if (n >= 10) return new Result(10, "X");
            if (n >= 9) return new Result(9, "IX");
            if (n >= 5) return new Result(5, "V");
            if (n >= 4) return new Result(4, "IV");
            return new Result(1, "I");
        }
    }


    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(990));
    }

}
