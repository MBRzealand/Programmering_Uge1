package Random;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Method {

    static String Time(String gmt) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        if ((Integer.parseInt(gmt) <= 14) && (Integer.parseInt(gmt) >= -12)) {

            String time = dtf.format(now);

            String[] timeSplit = time.split(":");

            int gmtTimeSplit = (Integer.parseInt(timeSplit[0]) + Integer.parseInt(gmt)) - 1;

            String gmtTimeSplitString = gmtTimeSplit + ":" + timeSplit[1] + ":" + timeSplit[2];

            return "Current time: " + gmtTimeSplitString;

        } else {

            return "Invalid GMT";

        }

    }

}
