package Kapitel5;

import java.text.DecimalFormat;
import java.util.ArrayList;

class Opgave5_6 {

    static DecimalFormat df = new DecimalFormat("0.000");

    static double pingToSQM(double ping){                          // sqm to ping method

        return ping * 3.305785;

    }

    static double sqmToPing(double sqm){                          // sqm to ping method

        return sqm * 0.302500011;

    }

    static String listLoop() {

        ArrayList<Integer> pingList = new ArrayList<>();
        ArrayList<Double> sqmList = new ArrayList<>();
        ArrayList<Double> pingList2 = new ArrayList<>();
        ArrayList<Integer> sqmList2 = new ArrayList<>();
        String formattedList = "Ping\t\tSquare meter\t|\t\tSquare meter\tPing\n";                 // initializes list with header

        for (int i = 10; i <= 80; i += 5) {                                                      // list of ping + list of sqm

            pingList.add(i);
            sqmList.add(pingToSQM(i));

        }

        for (int i = 30; i <= 100; i += 5) {                                                      // list of ping + list of sqm

            sqmList2.add(i);
            pingList2.add(sqmToPing(i));

        }

        for (int i = 0; i < sqmList.toArray().length; i++) {                              // makes table

            formattedList += (pingList.get(i) + "\t\t\t" + df.format(sqmList.get(i)) + "\t\t\t|\t\t"
                    + sqmList2.get(i) + "\t\t\t\t" + df.format(pingList2.get(i)) + "\n");

        }

        return formattedList;


    }

}

class Opgave5_6_Main {

    public static void main(String[] args) {

        System.out.println(Opgave5_6.listLoop());

    }

}

class Opgave5_6_Test {

    public static void main(String[] args) {


        // test case 1: input Ping = 10, input SQM = 30
        //expected output =
        // Ping		    SQM         |       SQM       Ping
        // 10           33.058      |       30        9.075

        System.out.println("Testcase 1:");

        if ((Opgave5_6.pingToSQM(10) == 33.05785)
                && (Opgave5_6.sqmToPing(30) == 9.07500033)) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 2: input Ping = 15, input SQM = 35
        //expected output =
        // Ping			SQM       |       SQM       Ping
        // 2            35.600    |       25        -3.889

        System.out.println("Testcase 2:");

        if ((Opgave5_5.celsiusToFarenheit(2) == 35.6)
                && (Opgave5_5.farenheitToCelsius(25) == (-3 + (-8/9.0)) )) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 2: input celsius = 98, input farenheit = 265
        //expected output =
        // Celsius			Farenheit       |       Farenheit       Celsius
        // 98               208.400         |       265             129.444

        System.out.println("Testcase 3:");

        if ((Opgave5_5.celsiusToFarenheit(98) == 208.4)
                && ( Opgave5_5.farenheitToCelsius(265) == 129 + 4/9.0)) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 2: input celsius = 100, input farenheit = 270
        //expected output =
        // Celsius			Farenheit       |       Farenheit       Celsius
        // 100              212.000         |       270             132.222

        System.out.println("Testcase 4:");

        if ((Opgave5_5.celsiusToFarenheit(100) == 212.0) && ( Opgave5_5.farenheitToCelsius(270) == 132 + 2/9.0 )) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }


    }

}