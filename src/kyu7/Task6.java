package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task6 {
    public static class Alarm {

        public static boolean setAlarm(boolean employed, boolean vacation) {
            return employed && !vacation;
        }

    }


    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Alarm.setAlarm(true, false));
        assertFalse("Should be false.", Alarm.setAlarm(true, true));
        assertFalse("Should be false.", Alarm.setAlarm(false, false));
        assertFalse("Should be false.", Alarm.setAlarm(false, true));
    }
}
