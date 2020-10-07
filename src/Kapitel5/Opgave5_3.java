package Kapitel5;

import java.util.ArrayList;

class Opgave5_3 {

    static double celsiusToFarenheit(int celsius){                          // farenheit to celsius method

        return ((celsius * 9/5.0) +32);

    }

    static String listLoop() {

        ArrayList<Integer> celsiusList = new ArrayList<>();
        ArrayList<Double> farenheitList = new ArrayList<>();
        String formattedList = "Celsius\t\t\tFarenheit\n";                                           // initializes list with header

            for (int i = 0; i <= 100; i += 2) {                                                      // list of celsius + list of farenheit

                celsiusList.add(i);
                farenheitList.add(celsiusToFarenheit(i));

            }


            for (int i = 0; i < farenheitList.toArray().length; i++) {                              // makes table

                formattedList += (celsiusList.get(i) + "\t\t\t\t" + farenheitList.get(i) + "\n");

            }

        return formattedList;



    }

}

class Opgave5_3_Main{

    public static void main(String[] args) {

        System.out.println(Opgave5_3.listLoop());

    }

}


class Opgave5_3_Test{

    public static void main(String[] args) {


        // test case 1: input celsius = 0
        //expected output =
        // Celsius			Farenheit
        // 0                32.0

        System.out.println("Testcase 1:");

        if (Opgave5_3.celsiusToFarenheit(0) == 32.0) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 2: input celsius = 2
        //expected output =
        // Celsius			Farenheit
        // 2                35.6

        System.out.println("Testcase 2:");

        if (Opgave5_3.celsiusToFarenheit(2) == 35.6) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 3: input celsius = 98
        //expected output =
        // Celsius			Farenheit
        // 98               208.4

        System.out.println("Testcase 3:");

        if (Opgave5_3.celsiusToFarenheit(98) == 208.4) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 4: input celsius = 100
        //expected output =
        // Celsius			Farenheit
        // 100              212.0

        System.out.println("Testcase 4:");

        if (Opgave5_3.celsiusToFarenheit(100) == 212.0) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

    }

}
