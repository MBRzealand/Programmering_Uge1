package Kapitel5;

import java.text.DecimalFormat;
import java.util.ArrayList;

class Opgave5_5 {

    static DecimalFormat df = new DecimalFormat("0.000");

    static double celsiusToFarenheit(int celsius){                          // farenheit to celsius method

        return ((celsius * 9/5.0) +32);

    }

    static double farenheitToCelsius(double farenheit){                          // farenheit to celsius method

        return ((farenheit -32 ) * 5/9.0);

    }

    static String listLoop() {

        ArrayList<Integer> celsiusList = new ArrayList<>();
        ArrayList<Double> farenheitList = new ArrayList<>();
        ArrayList<Double> celsiusList2 = new ArrayList<>();
        ArrayList<Integer> farenheitList2 = new ArrayList<>();
        String formattedList = "Celsius\t\tFarenheit\t\t|\t\tFarenheit\t\tCelsius\n";                                           // initializes list with header

        for (int i = 0; i <= 100; i += 2) {                                                      // list of celsius + list of farenheit

            celsiusList.add(i);
            farenheitList.add(celsiusToFarenheit(i));

        }

        for (int i = 20; i <= 270.0; i += 5.0) {                                                      // list of celsius + list of farenheit

            farenheitList2.add(i);
            celsiusList2.add(farenheitToCelsius(i));

        }

        for (int i = 0; i < farenheitList.toArray().length; i++) {                              // makes table

            formattedList += (celsiusList.get(i) + "\t\t\t" + df.format(farenheitList.get(i)) + "\t\t\t|\t\t"
                    + farenheitList2.get(i) + "\t\t\t\t" + df.format(celsiusList2.get(i)) + "\n");

        }

        return formattedList;


    }

}

class Opgave5_5_Main {

    public static void main(String[] args) {

        System.out.println(Opgave5_5.listLoop());

    }

}

class Opgave5_5_Test {

    public static void main(String[] args) {
        // test case 1: input celsius = 0, input farenheit = 20
        //expected output =
        // Celsius			Farenheit       |       Farenheit       Celsius
        // 0                32.000          |       20              -6.667

        System.out.println("Testcase 1:");

        if ((Opgave5_5.celsiusToFarenheit(0) == 32.0)
                && (Opgave5_5.farenheitToCelsius(20) == (-6 + (-2/3.0)) )) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 2: input celsius = 2, input farenheit = 25
        //expected output =
        // Celsius			Farenheit       |       Farenheit       Celsius
        // 2                35.600          |       25              -3.889

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
