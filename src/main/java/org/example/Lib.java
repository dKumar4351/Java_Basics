package main.java.org.example;

import java.time.LocalTime;

public interface Lib {

    /**
     * return "Good Morning" if hour before 12
     * returns "Good Afternoon" if hour before 6
     * returns "Good Evening" if hour after 6
     **/

    static String getGreeting()
    {
        int hour = LocalTime.now().getHour();
        if(hour < 12)
        {
            return "Good Morning";
        }
        else if (hour < 18)
            return  "Good Afternoon";
        else
            return "Good Evening";
    }
}
