package codewars.lvl8;

import java.time.LocalTime;

/**
 * Beginner Series #2 Clock
 *
 *  Clock shows h hours, m minutes and s seconds after midnight.
 *  Your task is to write a function which returns the time since midnight in milliseconds.
 */
public class Clock {
    public static int Past(int h, int m, int s)
    {
        //return (h*3600+m*60+s)*1000;
        //return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
        return LocalTime.of(h, m, s).toSecondOfDay()*1000;
    }
}
