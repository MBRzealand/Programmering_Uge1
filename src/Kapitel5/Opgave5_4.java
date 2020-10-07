package Kapitel5;

import java.util.ArrayList;

class Opgave5_4 {

    static double inchToCentimeter(int inches){                          // farenheit to celsius method

        return (inches * 2.54);

    }

    static String listLoop() {

        ArrayList<Double> centimeterList = new ArrayList<>();
        ArrayList<Integer> inchesList = new ArrayList<>();
        String formattedList = "Inches\t\t\tCentimetres\n";                                           // initializes list with header

        for (int i = 1; i <= 10; i++) {                                                      // list of celsius + list of farenheit

            inchesList.add(i);
            centimeterList.add(inchToCentimeter(i));

        }


        for (int i = 0; i < inchesList.toArray().length; i++) {                              // makes table

            formattedList += (inchesList.get(i) + "\t\t\t\t" + centimeterList.get(i) + "\n");

        }

        return formattedList;



    }

}

class Opgave5_4_Main {

    public static void main(String[] args) {

        System.out.println(Opgave5_4.listLoop());

    }

}

class Opgave5_4_Test {

    public static void main(String[] args) {


        // test case 1: input Inches = 1
        //expected output =
        // Inches			Centimeters
        // 1                2.54

        System.out.println("Testcase 1:");

        if (Opgave5_4.inchToCentimeter(1) == 2.54) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 1: input Inches = 2
        //expected output =
        // Inches			Centimeters
        // 2                5.08

        System.out.println("Testcase 2:");

        if (Opgave5_4.inchToCentimeter(2) == (2.54*2)) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 1: input Inches = 9
        //expected output =
        // Inches			Centimeters
        // 9                22.86

        System.out.println("Testcase 3:");

        if (Opgave5_4.inchToCentimeter(9) == (2.54*9)) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

        // test case 1: input Inches = 1
        //expected output =
        // Inches			Centimeters
        // 10               25.4

        System.out.println("Testcase 4:");

        if (Opgave5_4.inchToCentimeter(10) == (2.54*10)) {
            System.out.println("TEST SUCESSFUL\n");
        } else {
            System.out.println("TEST FAILED\n");
        }

    }

}

