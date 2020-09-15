package Kapitel2;

import java.text.DecimalFormat;
import java.util.Scanner;

class Opgave2_9 {

    static String acceleration() {

        System.out.println("Enter start velocity(m/s), ending velocity(m/s) and time(s) in following format: v_0, v_1, t:");

        Scanner input = new Scanner(System.in);
        String rawData = input.nextLine();
        String[] splitData = rawData.split(", ");

        double v_0 = Double.parseDouble(splitData[0]);
        double v_1 = Double.parseDouble(splitData[1]);
        double t = Double.parseDouble(splitData[2]);

        double accel = (v_1 - v_0) / t;

        DecimalFormat Round = new DecimalFormat("###.####");

        return "The average acceleration is: \n" + Round.format(accel) + " Meters per second per second (m/s/s)";


    }

    public static void main(String[] args) {

        System.out.println(acceleration());

    }


}
