package Kapitel2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Opgave2_8 {

    static String Time() {

        System.out.println("Enter GMT: ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Scanner input = new Scanner(System.in);

        String gmt = input.nextLine();

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

    public static void main(String[] args) {

        System.out.println(Time());

    }

}
